package com.ale.sneakerstoreapi.mapper.input;

import com.ale.sneakerstoreapi.entity.ProductSize;
import com.ale.sneakerstoreapi.util.UtilContent;
import com.ale.sneakerstoreapi.util.validation.ValueOfEnum;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductSizeInput {
    protected String id;
    @ValueOfEnum(enumClazz = ProductSize.Size.class)
    protected String size;
    @PositiveOrZero
    protected int quantity;
    @PositiveOrZero
    protected double price;

    public static ProductSize toProductSizeInsert(ProductSizeInput productSizeInput){
        return new ProductSize().builder()
                .size(Enum.valueOf(ProductSize.Size.class, productSizeInput.getSize()))
                .quantity(productSizeInput.getQuantity())
                .price(productSizeInput.getPrice())
                .build();
    }

    public static ProductSize toProductSizeUpdate(ProductSizeInput productSizeInput) {
        ProductSize productSize = toProductSizeInsert(productSizeInput);
        productSize.setId(UtilContent.parseObjectId(productSizeInput.getId()));
        return productSize;
    }
}
