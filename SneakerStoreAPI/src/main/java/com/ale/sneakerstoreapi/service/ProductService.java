package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.input.ProductInput;
import com.ale.sneakerstoreapi.mapper.view.ProductView;
import com.ale.sneakerstoreapi.entity.Product;
import org.bson.types.ObjectId;

import java.util.List;

public interface ProductService {
    public ProductView insert(ProductInput productInput);
    public ProductView update(ProductInput productInput, ObjectId objectId);
    public List<ProductView> findAll(QueryRequest queryRequest);
}
