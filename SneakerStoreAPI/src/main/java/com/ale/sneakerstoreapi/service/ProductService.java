package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.input.ProductInput;
import com.ale.sneakerstoreapi.mapper.view.ProductView;
import com.ale.sneakerstoreapi.entity.Product;

import java.util.List;

public interface ProductService {
    public ProductView insert(ProductInput productInput);
    public ProductView update(ProductInput productInput);
    public List<ProductView> findAll(QueryRequest queryRequest);
}
