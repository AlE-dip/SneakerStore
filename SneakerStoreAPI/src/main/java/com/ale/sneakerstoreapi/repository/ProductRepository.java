package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Modifying
    @Query(value = "update Product p set p.productCode = :productCode where p.id = :productId")
    int updateProductCode(@Param("productId") Long id, @Param("productCode") String productCode);
}
