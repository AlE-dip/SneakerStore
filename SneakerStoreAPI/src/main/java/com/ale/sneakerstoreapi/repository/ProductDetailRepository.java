package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.ProductDetail;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailRepository extends MongoRepository<ProductDetail, ObjectId> {
}
