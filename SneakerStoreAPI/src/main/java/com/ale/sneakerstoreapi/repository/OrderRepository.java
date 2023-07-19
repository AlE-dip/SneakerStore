package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
