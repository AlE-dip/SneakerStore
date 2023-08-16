package com.ale.sneakerstoreapi.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
    private String username;
    private String password;
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    @FieldNameConstants(onlyExplicitlyIncluded = true)
    public enum Role {
        @FieldNameConstants.Include ADMIN,
        @FieldNameConstants.Include CUSTOMER
    }

}
