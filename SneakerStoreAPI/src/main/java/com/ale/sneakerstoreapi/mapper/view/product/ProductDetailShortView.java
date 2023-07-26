package com.ale.sneakerstoreapi.mapper.view.product;

import com.ale.sneakerstoreapi.entity.ProductDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.modelmapper.ModelMapper;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailShortView {
    private Long id;
    protected ProductDetail.Color color;
    protected String imageUrl;
//    private List<String> imageUrlDetails;

    public static ProductDetailShortView newInstance(ProductDetail productDetail, ModelMapper mapper){
        ProductDetailShortView productDetailView = mapper.map(productDetail, ProductDetailShortView.class);
        return productDetailView;
    }
}
