package com.ale.sneakerstoreapi.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @MongoId
    private ObjectId id;
    private String productCode;
    private String name;
    private String description;
    private double discount;

    @DBRef(lazy = true)
    private List<ProductDetail> productDetails;
}
