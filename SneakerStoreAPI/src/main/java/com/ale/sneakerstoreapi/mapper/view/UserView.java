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

    public static UserView newInstance(UserInfo userInfo, String accessToken) {
        return new UserView().builder()
                .uuid(userInfo.getUser().getUuid())
                .username(userInfo.getUsername())
                .role(userInfo.getUser().getRole())
                .accessToken(accessToken)
                .build();
    }
}
