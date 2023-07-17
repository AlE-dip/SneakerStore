package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductView {
    private String id;
    private String name;
    private String description;
    private double discount;
    private String productCode;

    private List<ProductDetailView> productDetails;

    public static ProductView toProductView(Product product){
        return new ProductView().builder()
                .id(product.getId().toString())
                .productCode(product.getProductCode())
                .name(product.getName())
                .description(product.getDescription())
                .discount(product.getDiscount())
                .productDetails(product.getProductDetails().stream()
                        .map(ProductDetailView::toProductDetailView)
                        .toList())
                .build();

    }
}
