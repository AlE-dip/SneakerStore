package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.RefreshToken;
import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.mapper.input.RefreshTokenInput;
import com.ale.sneakerstoreapi.mapper.view.AccessToken;
import com.ale.sneakerstoreapi.util.exception.AppException;

public interface RefreshTokenService {
    AccessToken createAccessToken(RefreshTokenInput refreshTokenInput) throws AppException;
    RefreshToken createRefreshToken(User user);
}
