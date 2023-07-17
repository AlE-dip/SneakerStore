package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.view.ProductView;
import com.ale.sneakerstoreapi.entity.Product;

import java.util.List;

public interface ProductService {
    public Product save(Product product);
    public List<ProductView> findAll(QueryRequest queryRequest);
}
