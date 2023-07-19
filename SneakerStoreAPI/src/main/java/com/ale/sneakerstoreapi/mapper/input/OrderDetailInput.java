package com.ale.sneakerstoreapi.mapper.input;

import com.ale.sneakerstoreapi.entity.OrderDetail;
import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;
import org.modelmapper.ModelMapper;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailInput {

    @NotNull
    private Long productId;
    @NotNull
    private Long productDetailId;
    @NotNull
    private Long productSizeId;
    @Positive
    private int quantity;

    public OrderDetail toOrderDetail(ModelMapper mapper) {
        OrderDetail orderDetail = mapper.map(this, OrderDetail.class);
        orderDetail.setProduct(new Product().builder().id(productId).build());
        orderDetail.setProductDetail(new ProductDetail().builder().id(productDetailId).build());
        orderDetail.setProductSize(new ProductSize().builder().id(productSizeId).build());
        return orderDetail;
    }
}
