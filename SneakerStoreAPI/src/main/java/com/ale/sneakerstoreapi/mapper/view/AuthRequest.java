package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.User;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {
    @NotBlank(message = "username not blank")
    private String username;
    @NotBlank(message = "password not blank")
    private String password;
}
