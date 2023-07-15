package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    public Product save(Product product);
    public List<Product> findAll();
}
