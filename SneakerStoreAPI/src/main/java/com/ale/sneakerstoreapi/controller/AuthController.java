package com.ale.sneakerstoreapi.controller;

import com.ale.sneakerstoreapi.entity.RefreshToken;
import com.ale.sneakerstoreapi.mapper.input.RefreshTokenInput;
import com.ale.sneakerstoreapi.mapper.input.AuthRequest;
import com.ale.sneakerstoreapi.mapper.view.AccessToken;
import com.ale.sneakerstoreapi.mapper.view.UserView;
import com.ale.sneakerstoreapi.security.JwtTokenProvider;
import com.ale.sneakerstoreapi.security.UserInfo;
import com.ale.sneakerstoreapi.service.RefreshTokenService;
import com.ale.sneakerstoreapi.util.exception.AppException;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/public")
@AllArgsConstructor
public class AuthController {

    private final AuthenticationProvider authenticationProvider;
    private final JwtTokenProvider jwtTokenProvider;
    private final RefreshTokenService refreshTokenService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/test")
    public String test(){
        return "Ok";
    }

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
            RefreshToken refreshToken = refreshTokenService.createRefreshToken(userInfo.getUser());

            UserView userView = UserView.newInstance(userInfo, token, refreshToken.getToken());

            return ResponseEntity.ok().body(userView);
        } catch (BadCredentialsException ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @PostMapping("refresh")
    public ResponseEntity refresh(@Valid @RequestBody RefreshTokenInput refreshTokenInput) {
        try {
            AccessToken accessToken = refreshTokenService.createAccessToken(refreshTokenInput);
            return ResponseEntity.ok().body(accessToken);
        } catch (AppException e){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}