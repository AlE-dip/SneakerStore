package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.insert(user);
    }
}
