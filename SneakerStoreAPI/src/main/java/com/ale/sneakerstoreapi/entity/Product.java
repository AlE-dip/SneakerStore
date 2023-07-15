package com.ale.sneakerstoreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

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

//    @DBRef(lazy = true)
    private List<ProductDetail> productDetails;
}
