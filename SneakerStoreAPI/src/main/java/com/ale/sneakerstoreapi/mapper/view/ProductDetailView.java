package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.mapper.input.ProductDetailInput;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailView {
    private Long id;
    private ProductDetail.Color color;
    private String imageUrl;
//    private List<String> imageUrlDetails;

    private List<ProductSizeView> productSizes;

    public static ProductDetailView newInstance(ProductDetail productDetail, ModelMapper mapper){
        ProductDetailView productDetailView = mapper.map(productDetail, ProductDetailView.class);
        productDetailView.setProductSizes(productDetail.getProductSizes().stream()
                .map(productSize -> ProductSizeView.newInstance(productSize, mapper))
                .toList()
        );
        return productDetailView;
    }
}
