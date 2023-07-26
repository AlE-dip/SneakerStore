package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.OrderDetail;
import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    Optional<OrderDetail> findFirstByProductDetail(ProductDetail productDetail);
    Optional<OrderDetail> findFirstByProductSize(ProductSize productSize);
    Optional<OrderDetail> findFirstByProduct(Product product);
}
