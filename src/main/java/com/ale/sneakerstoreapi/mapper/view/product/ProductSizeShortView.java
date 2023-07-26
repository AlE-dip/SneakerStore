package com.ale.sneakerstoreapi.mapper.view.product;

import com.ale.sneakerstoreapi.entity.ProductSize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.modelmapper.ModelMapper;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ProductSizeShortView {
    protected Long id;
    protected ProductSize.Size size;

    public static ProductSizeShortView newInstance(ProductSize productSize, ModelMapper mapper){
        ProductSizeShortView productSizeView = mapper.map(productSize, ProductSizeShortView.class);
        return productSizeView;
    }
}
