package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.*;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("select o from Order o where o.user.uuid = :uuid and o.orderNumber = :orderNumber")
    Optional<Order> findFirstByOrderNumber(UUID uuid, String orderNumber);
    @Query("select o from Order o where o.user.uuid = :uuid")
    List<Order> findAllByUuid(UUID uuid, PageRequest pageRequest);
}
