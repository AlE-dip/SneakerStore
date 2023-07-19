package com.ale.sneakerstoreapi.controller;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.mapper.input.OrderInput;
import com.ale.sneakerstoreapi.mapper.view.OrderView;
import com.ale.sneakerstoreapi.service.OrderService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RolesAllowed({User.Role.Fields.ADMIN,User.Role.Fields.CUSTOMER})
@RequestMapping("order")
@AllArgsConstructor
public class OrderController {
    private OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public OrderView createOrder(@Valid @RequestBody OrderInput orderInput){
        OrderView orderView = orderService.create(orderInput);
        return orderView;
    }
}
