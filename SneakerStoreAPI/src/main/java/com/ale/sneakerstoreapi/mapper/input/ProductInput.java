package com.ale.sneakerstoreapi.mapper.input;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductInput {
    public String id;
    public String name;
    public String description;
    public double discount;

    public List<ProductDetailInput> productDetails;
}
