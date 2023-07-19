package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.OrderDetail;
import com.ale.sneakerstoreapi.repository.OrderDetailRepository;
import com.ale.sneakerstoreapi.repository.ProductDetailRepository;
import com.ale.sneakerstoreapi.repository.ProductRepository;
import com.ale.sneakerstoreapi.repository.ProductSizeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailService {
    private OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDetail create(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }
}
