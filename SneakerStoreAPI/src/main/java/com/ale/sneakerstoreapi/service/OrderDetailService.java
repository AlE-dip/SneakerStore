package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.OrderDetail;
import com.ale.sneakerstoreapi.mapper.view.OrderDetailView;

public interface OrderDetailService {
    OrderDetail create(OrderDetail orderDetail);
}
