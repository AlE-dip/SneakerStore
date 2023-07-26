package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Paypal;
import com.ale.sneakerstoreapi.mapper.input.PaypalInput;
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
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
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

    @Override
    public String addDefault(PaypalInput paypalInput) throws Throwable {
        CompletableFuture<String> future = new CompletableFuture<>();
        Paypal paypal = paypalInput.toPaypal(mapper);
        getAccessToken(paypal).get();
        paypalRepository.getFirstByClientId(paypal.getClientId()).ifPresentOrElse(p -> {
            p.setClientId(paypal.getClientId());
            p.setSecret(paypal.getSecret());
            paypalRepository.save(p);
        }, () -> {
            paypalRepository.save(paypal);
        });

        return MessageContent.EXECUTE_SUCCESS;
    }

    @Async
    public Future<String> getAccessToken(Paypal paypal) {
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

    private String getBasicAuthenticationHeader(String username, String password) {
        String valueToEncode = username + ":" + password;
        return "Basic " + Base64.getEncoder().encodeToString(valueToEncode.getBytes());
    }
}
