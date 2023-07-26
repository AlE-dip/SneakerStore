package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.ProductDetail;

public interface ProductDetailService {
    public ProductDetail save(ProductDetail productDetail);
    void delete(Long id);
    ProductDetail findById(Long id);
}
