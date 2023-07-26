package com.ale.sneakerstoreapi.mapper.update;

import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.mapper.input.ProductDetailInput;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
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
public class ProductUpdate {
    @NotBlank
    public String name;
    public String description;
    @PositiveOrZero
    public double discount;

    public Product toProduct(ModelMapper mapper) {
        Product product = mapper.map(this, Product.class);
        return product;
    }

    public static ProductUpdate newInstance(Product product, ModelMapper mapper) {
        ProductUpdate productUpdate = mapper.map(product, ProductUpdate.class);
        return productUpdate;
    }

    public void updateProduct(Product product){
        product.setName(name);
        product.setDescription(description);
        product.setDiscount(discount);
    }

}
