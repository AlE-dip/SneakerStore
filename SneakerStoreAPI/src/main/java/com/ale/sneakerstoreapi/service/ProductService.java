package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.input.ProductInput;
import com.ale.sneakerstoreapi.mapper.update.ProductUpdate;
import com.ale.sneakerstoreapi.mapper.view.ProductView;

import java.util.List;

public interface ProductService {
    ProductView create(ProductInput productInput);
    ProductUpdate update(ProductUpdate productUpdate, String productCode);
    List<ProductView> findAll(QueryRequest queryRequest);
    Product findById(Long id);
    Product findByProductCode(String productCode);
    ProductView getByProductCode(String productCode);
}
