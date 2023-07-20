package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductView {
    private String productCode;
    private String name;
    private String description;
    private double discount;


    private List<ProductDetailView> productDetails;

    public static ProductView newInstance(Product product, ModelMapper mapper){
        ProductView productView = mapper.map(product, ProductView.class);
        return productView;
    }

}
