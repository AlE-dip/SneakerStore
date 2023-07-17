package com.ale.sneakerstoreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;
import java.util.List;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @MongoId
    private ObjectId id;
    private String orderId;
    private double total;

    @DBRef
    private List<OrderDetail> orderDetails;

    @DBRef
    private User user;
}
