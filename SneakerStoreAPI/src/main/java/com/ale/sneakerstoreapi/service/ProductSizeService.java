package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
import org.bson.types.ObjectId;

public interface ProductSizeService {
    public ProductSize save(ProductSize productSize);
    public void delete(ObjectId id);
}
