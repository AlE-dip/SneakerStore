package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSizeRepository extends MongoRepository<ProductSize, Long> {
}
