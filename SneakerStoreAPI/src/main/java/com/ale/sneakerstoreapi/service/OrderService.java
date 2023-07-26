package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Order;
import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.input.OrderInput;
import com.ale.sneakerstoreapi.mapper.input.OrderOwner;
import com.ale.sneakerstoreapi.mapper.view.order.OrderView;

import java.util.List;

public interface OrderService {
    OrderView create(OrderInput orderInput);
    List<OrderView> findAll(QueryRequest queryRequest, OrderOwner orderOwner);
    OrderView getByOrderNumber(String orderNumber, OrderOwner orderOwner);
    Order findByOrderNumber(String orderNumber, OrderOwner orderOwner);
}
