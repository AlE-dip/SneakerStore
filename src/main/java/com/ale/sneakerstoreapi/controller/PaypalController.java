package com.ale.sneakerstoreapi.controller;

import com.ale.sneakerstoreapi.entity.Order;
import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.mapper.input.OrderOwner;
import com.ale.sneakerstoreapi.mapper.input.PaypalInput;
import com.ale.sneakerstoreapi.service.PaypalService;
import com.ale.sneakerstoreapi.util.MessageContent;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/paypal")
@RolesAllowed(User.Role.Fields.ADMIN)
@AllArgsConstructor
public class PaypalController {
    private final PaypalService paypalService;

    @PostMapping("/account")
    @ResponseStatus(HttpStatus.OK)
    public String addDefault(@Valid @RequestBody PaypalInput paypalInput) throws Throwable {
        return paypalService.addDefault(paypalInput);
    }
}
