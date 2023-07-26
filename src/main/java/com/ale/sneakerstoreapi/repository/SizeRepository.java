package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.ProductSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends JpaRepository<ProductSize, Long> {

}
