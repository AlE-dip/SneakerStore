package com.ale.sneakerstoreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    @MongoId
    private ObjectId id;

    @DBRef(lazy = true)
    private Product product;

    @DBRef(lazy = true)
    private ProductDetail productDetail;

    private int quantity;
    private double price;

}
