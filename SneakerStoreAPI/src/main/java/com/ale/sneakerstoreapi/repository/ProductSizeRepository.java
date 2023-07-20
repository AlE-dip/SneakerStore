package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.ProductSize;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSizeRepository extends JpaRepository<ProductSize, Long> {
    @Transactional
    @Modifying
    @Query("update ProductSize set inventory = inventory - :quantity where id = :id and inventory > 0")
    int reduceInventory(Long id, int quantity);
}
