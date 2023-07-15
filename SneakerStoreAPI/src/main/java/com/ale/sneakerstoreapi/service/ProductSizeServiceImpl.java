package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.ProductSize;
import com.ale.sneakerstoreapi.repository.ProductSizeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductSizeServiceImpl implements ProductSizeService {
    private ProductSizeRepository productSizeRepository;
    @Override
    public ProductSize save(ProductSize productSize) {
        return productSizeRepository.save(productSize);
    }
}
