package com.ale.sneakerstoreapi.service;


import com.ale.sneakerstoreapi.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.UUID;

public interface UserService extends UserDetailsService {
    User save(User user);
    User findFirst();
    User findById(UUID id);

}
