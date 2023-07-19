package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.ProductSize;

public interface ProductSizeService {
    ProductSize save(ProductSize productSize);
    void delete(Long id);
    void reduceInventory(Long id, int quantity);
    ProductSize findById(Long id);
}
