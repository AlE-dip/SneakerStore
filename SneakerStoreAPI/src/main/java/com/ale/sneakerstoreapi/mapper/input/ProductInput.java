package com.ale.sneakerstoreapi.mapper.input;

import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.util.UtilContent;
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
public class ProductInput {
    @NotBlank
    public String name;
    public String description;
    @PositiveOrZero
    public double discount;
    @Valid
    public List<ProductDetailInput> productDetails;

    public Product toProduct(ModelMapper mapper) {
        Product product = mapper.map(this, Product.class);
        List<ProductDetail> productDetails = this.productDetails != null
                ? this.productDetails.stream()
                        .map(productDetailInput -> {
                            ProductDetail productDetail = productDetailInput.toProductDetail(mapper);
                            productDetail.setProduct(product);
                            return productDetail;
                        })
                        .toList()
                : new ArrayList<>();
        product.setProductDetails(productDetails);
        return product;
    }

}
