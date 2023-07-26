package com.ale.sneakerstoreapi.controller;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.input.OrderInput;
import com.ale.sneakerstoreapi.mapper.input.OrderOwner;
import com.ale.sneakerstoreapi.mapper.view.order.OrderView;
import com.ale.sneakerstoreapi.service.OrderService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RolesAllowed({User.Role.Fields.ADMIN,User.Role.Fields.CUSTOMER})
@RequestMapping("order")
@AllArgsConstructor
public class OrderController {
    private OrderService orderService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List getOrders(
            @Valid QueryRequest queryRequest,
            @Valid @RequestBody OrderOwner orderOwner
    ) {
        List<OrderView> orderViews = orderService.findAll(queryRequest, orderOwner);
        return orderViews;
    }

    @GetMapping("/{productCode}")
    @ResponseStatus(HttpStatus.OK)
    public OrderView getOrder(
            @PathVariable String productCode,
            @Valid @RequestBody OrderOwner orderOwner
    ) {
        OrderView orderView = orderService.getByOrderNumber(productCode, orderOwner);
        return orderView;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public OrderView createOrder(@Valid @RequestBody OrderInput orderInput){
        OrderView orderView = orderService.create(orderInput);
        return orderView;
    }
}
