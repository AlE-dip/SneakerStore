package com.ale.sneakerstoreapi.mapper.input;

import com.ale.sneakerstoreapi.entity.ProductSize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductSizeInput {
    protected String id;
    protected ProductSize.Size size;
    protected int quantity;
    protected double price;
}
