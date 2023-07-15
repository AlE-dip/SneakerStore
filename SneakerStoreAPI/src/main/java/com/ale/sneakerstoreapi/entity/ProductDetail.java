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
public class ProductDetail {
    @MongoId
    private ObjectId id;
    private Color color;
    private String imageUrl;
    private List<String> imageUrlDetails;
    @DBRef
    private List<ProductSize> productSizes;


    public enum Color{
        WHITE,
        BLUE,
        RED,
        BLACK,
        YELLOW
    }
}
