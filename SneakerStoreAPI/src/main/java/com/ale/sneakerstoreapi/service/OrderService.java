package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.mapper.input.OrderInput;
import com.ale.sneakerstoreapi.mapper.view.OrderView;

public interface OrderService {
    OrderView create(OrderInput orderInput);
}
