package com.ale.sneakerstoreapi.mapper.input;

import com.ale.sneakerstoreapi.entity.ProductDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailInput {
    protected String id;
    protected ProductDetail.Color color;
    protected String imageUrl;
    protected List<String> imageUrlDetails;

    protected List<ProductSizeInput> productSizes;
}
