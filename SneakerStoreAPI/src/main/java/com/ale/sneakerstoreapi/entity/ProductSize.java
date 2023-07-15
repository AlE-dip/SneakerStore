package com.ale.sneakerstoreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductSize {
    @MongoId
    private ObjectId id;
    private Size size;
    private int quantity;
    private double price;

    public enum Size {
        _40,
        _41,
        _42,
        _43,
        _44,
        _45,
        _46,

    }
}
