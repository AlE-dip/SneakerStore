package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Order;
import com.ale.sneakerstoreapi.mapper.input.PaypalInput;

import java.util.concurrent.CompletableFuture;

public interface PaypalService {
    String addDefault(PaypalInput paypalInput) throws Throwable;
    CompletableFuture<Order> createOrder(Order order);
    CompletableFuture<Order> captureOrder(Order order);
}
