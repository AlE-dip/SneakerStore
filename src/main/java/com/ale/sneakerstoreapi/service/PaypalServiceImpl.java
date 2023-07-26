package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Order;
import com.ale.sneakerstoreapi.entity.Paypal;
import com.ale.sneakerstoreapi.mapper.input.PaypalInput;
import com.ale.sneakerstoreapi.mapper.request.PaypalOrder;
import com.ale.sneakerstoreapi.repository.PaypalRepository;
import com.ale.sneakerstoreapi.util.MessageContent;
import com.ale.sneakerstoreapi.util.exception.AppException;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import lombok.AllArgsConstructor;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PaypalServiceImpl implements PaypalService {
    private PaypalRepository paypalRepository;
    private ModelMapper mapper;

    private final String url = "https://api-m.sandbox.paypal.com";
    private final String accessTokenUrl = "/v1/oauth2/token";
    private final String createOrder = "/v2/checkout/orders";

    @Override
    public String addDefault(PaypalInput paypalInput) throws Throwable {
        CompletableFuture<String> future = new CompletableFuture<>();
        Paypal paypal = paypalInput.toPaypal(mapper);
        getAccessToken(paypal).get();
        paypalRepository.findFirstByClientId(paypal.getClientId()).ifPresentOrElse(p -> {
            p.setClientId(paypal.getClientId());
            p.setSecret(paypal.getSecret());
            paypalRepository.save(p);
        }, () -> {
            paypalRepository.save(paypal);
        });

        return MessageContent.EXECUTE_SUCCESS;
    }

    @Override
    public CompletableFuture<Order> createOrder(Order order) {
        CompletableFuture<Order> future = new CompletableFuture<>();
        paypalRepository.findFirstByOrderByIdAsc().ifPresentOrElse(paypal -> {
            PaypalOrder paypalOrder = PaypalOrder.newInstance(order.getTotal());
            JSONObject jsonObject = new JSONObject(paypalOrder);
            System.out.println(jsonObject);
            createRequest(paypal, url + createOrder, HttpRequest.BodyPublishers.ofString(jsonObject.toString()))
                    .thenAccept(httpResponse -> {
                        if (httpResponse.statusCode() == MessageContent.CREATED){
                            JSONObject json = new JSONObject(httpResponse.body());
                            String paypalOrderId = json.getString("id");
                            String link = json.getJSONArray("links").getJSONObject(1).getString("href");
                            order.setPaypalOrderId(paypalOrderId);
                            order.setApproveUrl(link);
                            order.setPaymentStatus(Order.PaymentStatus.NEW);
                            future.complete(order);
                        } else {
                            order.setPaymentStatus(Order.PaymentStatus.FAILED);
                        }
                    })
                    .join();
        }, () -> {
            throw new AppException(MessageContent.PAYPAL_ACCOUNT_NOT_FOUND);
        });
        return future;
    }

    @Async
    public CompletableFuture<String> getAccessToken(Paypal paypal) {
        CompletableFuture<String> future = new CompletableFuture<>();
        HttpClient client = HttpClient.newHttpClient();
        String form = Map.of(
                        "grant_type", "client_credentials"
                )
                .entrySet()
                .stream()
                .map(entry -> String.join(
                        "=",
                        URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8),
                        URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8)
                ))
                .collect(Collectors.joining("&"));
        HttpRequest request = HttpRequest.newBuilder(URI.create(url + accessTokenUrl))
                .POST(HttpRequest.BodyPublishers.ofString(form))
                .header("Authorization", getBasicAuthenticationHeader(paypal.getClientId(), paypal.getSecret()))
                .headers("Content-Type", "application/x-www-form-urlencoded")
                .build();

        client.sendAsync(request, BodyHandlers.ofString())
                .thenAccept(httpResponse -> {
                    if (httpResponse.statusCode() == MessageContent.SUCCESS) {
                        JSONObject json = new JSONObject(httpResponse.body());
                        future.complete(json.getString("access_token"));
                    } else {
                        throw new CompletionException(MessageContent.EXECUTE_FAILED, new Throwable());
                    }
                })
                .join();
        return future;
    }


    public CompletableFuture<HttpResponse<String>> createRequest(Paypal paypal, String url, HttpRequest.BodyPublisher body) {
        CompletableFuture<HttpResponse<String>> future = new CompletableFuture<>();
        getAccessToken(paypal).thenAccept(token -> {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create(url))
                    .POST(body)
                    .header("Authorization", "Bearer " + token)
                    .headers("Content-Type", "application/json")
                    .build();
            future.complete(httpClient.sendAsync(request, BodyHandlers.ofString()).join());
        });

        return future;
    }


    private String getBasicAuthenticationHeader(String username, String password) {
        String valueToEncode = username + ":" + password;
        return "Basic " + Base64.getEncoder().encodeToString(valueToEncode.getBytes());
    }
}
