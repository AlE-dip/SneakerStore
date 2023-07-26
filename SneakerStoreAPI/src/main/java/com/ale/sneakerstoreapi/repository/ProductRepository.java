package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Transactional
    @Modifying
    @Query(value = "update Product p set p.productCode = :productCode where p.id = :id")
    int updateProductCode(Long id, String productCode);
    Optional<Product> findFirstByProductCode(String productCode);
}
