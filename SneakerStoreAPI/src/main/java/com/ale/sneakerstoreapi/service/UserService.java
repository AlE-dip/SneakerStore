package com.ale.sneakerstoreapi.service;


import com.ale.sneakerstoreapi.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public User save(User user);
    public User findFirst();
}
