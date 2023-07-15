package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    @Override
    public Product save(Product product) {
        return productRepository.insert(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
