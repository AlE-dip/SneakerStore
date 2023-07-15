package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.repository.ProductDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductDetailServiceImpl implements ProductDetailService {
    private ProductDetailRepository productDetailRepository;
    @Override
    public ProductDetail save(ProductDetail productDetail) {
        return productDetailRepository.save(productDetail);
    }


}
