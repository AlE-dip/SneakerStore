package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.Product;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

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

    public static ProductView newInstance(Product product){

        return new ProductView().builder()
                .id(product.getId().toString())
                .productCode(product.getProductCode())
                .name(product.getName())
                .description(product.getDescription())
                .discount(product.getDiscount())
                .productDetails(product.getProductDetails().stream()
                        .map(ProductDetailView::newInstance)
                        .toList())
                .build();

    }

    public static Product toProduct(ProductView productView){
        return new Product().builder()
//                .id(new ObjectId(productView.getId()))
                .productCode(productView.getProductCode())
                .name(productView.getName())
                .description(productView.getDescription())
                .discount(productView.getDiscount())
//                .productDetails(productView.getProductDetails().stream()
//                        .map(ProductDetailView::toProductDetailView)
//                        .toList())
                .build();

    }
}
