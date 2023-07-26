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
public class ProductShortView {
    protected String productCode;
    protected String name;
    protected String description;

    public static ProductShortView newInstance(ProductSize productSize, ModelMapper mapper){
        ProductShortView productSizeView = mapper.map(productSize, ProductShortView.class);
        return productSizeView;
    }
}
