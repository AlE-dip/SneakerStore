package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.entity.User;
import jakarta.validation.Valid;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
}
