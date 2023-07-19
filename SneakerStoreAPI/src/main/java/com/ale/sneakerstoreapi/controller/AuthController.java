package com.ale.sneakerstoreapi.controller;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.mapper.view.AuthRequest;
import com.ale.sneakerstoreapi.mapper.view.UserView;
import com.ale.sneakerstoreapi.security.JwtTokenProvider;
import com.ale.sneakerstoreapi.security.UserInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.aspectj.apache.bcel.classfile.ModuleMainClass;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/public")
@AllArgsConstructor
public class AuthController {

    private final AuthenticationProvider authenticationProvider;
    private final JwtTokenProvider jwtTokenProvider;
    private final ModelMapper mapper;

    @PostMapping("login")
    public ResponseEntity login(@Valid @RequestBody AuthRequest request) {
        try {
            Authentication authenticate = authenticationProvider.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getUsername(), request.getPassword()
                    )
            );

            UserInfo userInfo = (UserInfo) authenticate.getPrincipal();
            String token = jwtTokenProvider.generateToken(userInfo);

            return ResponseEntity
                    .ok()
                    .body(UserView.newInstance(userInfo, token));
        } catch (BadCredentialsException ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

}