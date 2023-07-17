package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.ProductSize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductSizeView {
    private String id;
    private ProductSize.Size size;
    private int quantity;
    private double price;

    public static ProductSizeView toProductSizeView(ProductSize productSize){
        return new ProductSizeView().builder()
                .id(productSize.getId().toString())
                .size(productSize.getSize())
                .quantity(productSize.getQuantity())
                .price(productSize.getPrice())
                .build();
    }
}
