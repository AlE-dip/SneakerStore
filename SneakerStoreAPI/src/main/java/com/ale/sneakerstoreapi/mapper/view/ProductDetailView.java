package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.mapper.input.ProductDetailInput;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailView {
    private String id;
    private ProductDetail.Color color;
    private String imageUrl;
    private List<String> imageUrlDetails;

    private List<ProductSizeView> productSizes;

    public static ProductDetailView newInstance(ProductDetail productDetail){
        return ProductDetailView.builder()
                .id(productDetail.getId().toString())
                .color(productDetail.getColor())
                .imageUrl(productDetail.getImageUrl())
                .imageUrlDetails(productDetail.getImageUrlDetails())
                .productSizes(productDetail.getProductSizes().stream()
                        .map(ProductSizeView::newInstance)
                        .toList())
                .build();
    }
}
