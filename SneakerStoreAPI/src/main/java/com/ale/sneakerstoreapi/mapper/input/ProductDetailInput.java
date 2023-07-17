package com.ale.sneakerstoreapi.mapper.input;

import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
import com.ale.sneakerstoreapi.util.UtilContent;
import com.ale.sneakerstoreapi.util.validation.ValueOfEnum;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
public class ProductDetailInput {
    protected String id;
    @ValueOfEnum(enumClazz = ProductDetail.Color.class)
    protected String color;
    @NotBlank
    protected String imageUrl;
    protected List<String> imageUrlDetails;

    @Valid
    @NotEmpty
    protected List<ProductSizeInput> productSizes;

    public static ProductDetail toProductDetailInsert(ProductDetailInput productDetailInput){
        List<ProductSize> productSizes = productDetailInput.getProductSizes() != null
                ? productDetailInput.getProductSizes().stream()
                        .map(ProductSizeInput::toProductSizeInsert)
                        .toList()
                : new ArrayList<>();
        return toProductDetail(productDetailInput, productSizes);
    }

    public static ProductDetail toProductDetailUpdate(ProductDetailInput productDetailInput) {
        List<ProductSize> productSizes = productDetailInput.getProductSizes() != null
                ? productDetailInput.getProductSizes().stream()
                .map(ProductSizeInput::toProductSizeInsert)
                .toList()
                : new ArrayList<>();
        ProductDetail productDetail = toProductDetail(productDetailInput, productSizes);
        productDetail.setId(UtilContent.parseObjectId(productDetailInput.getId()));
        return productDetail;
    }

    public static ProductDetail toProductDetail(ProductDetailInput productDetailInput, List<ProductSize> productSizes){
        return new ProductDetail().builder()
                .color(Enum.valueOf(ProductDetail.Color.class, productDetailInput.getColor()))
                .imageUrl(productDetailInput.getImageUrl())
                .imageUrlDetails(productDetailInput.getImageUrlDetails())
                .productSizes(productSizes)
                .build();
    }
}
