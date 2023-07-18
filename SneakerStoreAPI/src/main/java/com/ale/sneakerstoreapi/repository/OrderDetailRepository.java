package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.OrderDetail;
import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderDetailRepository extends MongoRepository<OrderDetail, ObjectId> {
    Optional<OrderDetail> findFirstByProductDetail(ProductDetail productDetail);
    Optional<OrderDetail> findFirstByProductSize(ProductSize productSize);
    Optional<OrderDetail> findFirstByProduct(Product product);
}
