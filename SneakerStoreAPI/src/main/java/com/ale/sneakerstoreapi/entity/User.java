package com.ale.sneakerstoreapi.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import org.bson.types.ObjectId;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @MongoId
    private ObjectId id;
    private String username;
    private String password;
    private Role role;

    @FieldNameConstants(onlyExplicitlyIncluded = true)
    public enum Role {
        @FieldNameConstants.Include ADMIN,
        @FieldNameConstants.Include CUSTOMER
    }

}
