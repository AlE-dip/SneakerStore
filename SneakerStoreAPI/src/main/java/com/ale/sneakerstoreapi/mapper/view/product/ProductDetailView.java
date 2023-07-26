package com.ale.sneakerstoreapi.mapper.view.product;

import com.ale.sneakerstoreapi.entity.ProductDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.modelmapper.ModelMapper;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailView extends ProductDetailShortView{
    protected List<ProductSizeView> productSizes;

    public static ProductDetailView newInstance(ProductDetail productDetail, ModelMapper mapper){
        ProductDetailView productDetailView = mapper.map(productDetail, ProductDetailView.class);
        return productDetailView;
    }
}
