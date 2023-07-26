package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Paypal;
import com.ale.sneakerstoreapi.mapper.input.PaypalInput;
import org.springframework.scheduling.annotation.EnableAsync;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public interface PaypalService {

    String addDefault(PaypalInput paypalInput) throws Throwable;
}
