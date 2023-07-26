package com.ale.sneakerstoreapi.mapper.view.product;

import com.ale.sneakerstoreapi.entity.ProductSize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.modelmapper.ModelMapper;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ProductSizeView extends ProductSizeShortView{

    private int inventory;
    private double price;

    public static ProductSizeView newInstance(ProductSize productSize, ModelMapper mapper){
        ProductSizeView productSizeView = mapper.map(productSize, ProductSizeView.class);
        return productSizeView;
    }
}
