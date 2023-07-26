package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.security.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserView {
    private UUID uuid;
    private String username;
    private User.Role role;
    private String accessToken;
    private String token;

    public static UserView newInstance(UserInfo userInfo, String accessToken, String token) {
        return new UserView().builder()
                .uuid(userInfo.getUser().getUuid())
                .username(userInfo.getUsername())
                .role(userInfo.getUser().getRole())
                .accessToken(accessToken)
                .token(token)
                .build();
    }
}
