package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.entity.ProductDetail;
import org.bson.types.ObjectId;

public interface ProductDetailService {
    public ProductDetail save(ProductDetail productDetail);
    void delete(ObjectId id);
}
