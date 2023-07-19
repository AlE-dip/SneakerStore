package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.input.ProductInput;
import com.ale.sneakerstoreapi.mapper.view.ProductView;

import java.util.List;

public interface ProductService {
    public ProductView create(ProductInput productInput);
    public ProductView update(ProductInput productInput, Long Long);
    public List<ProductView> findAll(QueryRequest queryRequest);
    public Product findById(Long id);
}
