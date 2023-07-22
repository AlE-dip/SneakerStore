package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.RefreshToken;
import com.ale.sneakerstoreapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findFirstByToken(String token);
    Optional<RefreshToken> findFirstByUser(User user);
}
