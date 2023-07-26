package com.ale.sneakerstoreapi.mapper.input;

import com.ale.sneakerstoreapi.entity.ProductSize;
import com.ale.sneakerstoreapi.util.UtilContent;
import com.ale.sneakerstoreapi.util.validation.ValueOfEnum;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductSizeInput {
    @ValueOfEnum(enumClazz = ProductSize.Size.class)
    protected String size;
    @PositiveOrZero
    protected int inventory;
    @PositiveOrZero
    protected double price;

    public ProductSize toProductSize(ModelMapper mapper){
        ProductSize productSize = mapper.map(this, ProductSize.class);
        productSize.setSize(Enum.valueOf(ProductSize.Size.class, size));
        return productSize;
    }
}
