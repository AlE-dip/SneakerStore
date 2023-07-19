package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.ProductSize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductSizeView {
    private Long id;
    private ProductSize.Size size;
    private int inventory;
    private double price;

    public static ProductSizeView newInstance(ProductSize productSize, ModelMapper mapper){
        ProductSizeView productSizeView = mapper.map(productSize, ProductSizeView.class);
        return productSizeView;
    }
}
