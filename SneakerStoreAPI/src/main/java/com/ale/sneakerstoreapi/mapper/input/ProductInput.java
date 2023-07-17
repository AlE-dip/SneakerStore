package com.ale.sneakerstoreapi.mapper.input;

import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.util.UtilContent;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
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
public class ProductInput {
    @NotBlank
    public String name;
    public String description;
    @PositiveOrZero
    public double discount;
    @Valid
    public List<ProductDetailInput> productDetails;

    public static Product toProductInsert(ProductInput productInput) {
        List<ProductDetail> productDetails = productInput.getProductDetails() != null
                ? productInput.getProductDetails().stream()
                        .map(ProductDetailInput::toProductDetailInsert)
                        .toList()
                : new ArrayList<>();
        return toProduct(productInput, productDetails);
    }

    public static Product toProductUpdate(ProductInput productInput) {
        List<ProductDetail> productDetails = productInput.getProductDetails() != null
                ? productInput.getProductDetails().stream()
                .map(ProductDetailInput::toProductDetailUpdate)
                .toList()
                : new ArrayList<>();
        return toProduct(productInput, productDetails);
    }

    public static Product toProduct(ProductInput productInput, List<ProductDetail> productDetails) {
        String productCode = UtilContent.PRODUCT_CODE_FORMAT + System.currentTimeMillis();
        return new Product().builder()
                .name(productInput.getName())
                .productCode(productCode)
                .description(productInput.getDescription())
                .discount(productInput.getDiscount())
                .productDetails(productDetails)
                .build();
    }
}
