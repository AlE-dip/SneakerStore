package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.Paypal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaypalRepository extends JpaRepository<Paypal, Long> {
    Optional<Paypal> findFirstByClientId(String clientId);
    Optional<Paypal> findFirstByOrderByIdAsc();
}
