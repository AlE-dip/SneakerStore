package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.security.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserView {
    private String username;
    private User.Role role;
    private String accessToken;

    public static UserView newInstance(UserInfo userInfo, String accessToken) {
        return new UserView().builder()
                .username(userInfo.getUsername())
                .role(userInfo.getUser().getRole())
                .accessToken(accessToken)
                .build();
    }
}
