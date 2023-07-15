package com.ale.sneakerstoreapi.repository;

import com.ale.sneakerstoreapi.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
}
