package com.ale.sneakerstoreapi.mapper.input;

import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
import com.ale.sneakerstoreapi.util.UtilContent;
import com.ale.sneakerstoreapi.util.validation.ValueOfEnum;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
public class ProductDetailInput {
    @ValueOfEnum(enumClazz = ProductDetail.Color.class)
    private String color;
    @NotBlank
    private String imageUrl;
//    private List<String> imageUrlDetails;

    @Valid
    @NotEmpty
    private List<ProductSizeInput> productSizes;

    public ProductDetail toProductDetail(ModelMapper mapper){
        ProductDetail productDetail = mapper.map(this, ProductDetail.class);

        List<ProductSize> productSizes = this.productSizes != null
                ? this.productSizes.stream()
                        .map(productSizeInput -> {
                            ProductSize productSize = productSizeInput.toProductSize(mapper);
                            productSize.setProductDetail(productDetail);
                            return productSize;
                        })
                        .toList()
                : new ArrayList<>();

        productDetail.setColor(Enum.valueOf(ProductDetail.Color.class, color));
        productDetail.setProductSizes(productSizes);
        return productDetail;
    }
}
