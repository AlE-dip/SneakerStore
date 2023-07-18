package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.ProductSize;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends MongoRepository<ProductSize, ObjectId> {

}
