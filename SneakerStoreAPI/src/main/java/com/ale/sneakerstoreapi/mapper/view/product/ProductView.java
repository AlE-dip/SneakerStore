package com.ale.sneakerstoreapi.mapper.view.product;

import com.ale.sneakerstoreapi.entity.Product;
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
public class ProductView extends ProductShortView{

    private double discount;


    private List<ProductDetailView> productDetails;

    public static ProductView newInstance(Product product, ModelMapper mapper){
        ProductView productView = mapper.map(product, ProductView.class);
        return productView;
    }

}
