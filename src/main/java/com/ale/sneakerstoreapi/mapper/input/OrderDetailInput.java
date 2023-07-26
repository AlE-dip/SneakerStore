package com.ale.sneakerstoreapi.mapper.input;

import com.ale.sneakerstoreapi.entity.OrderDetail;
import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.modelmapper.ModelMapper;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailInput {

    @NotNull
    private String productCode;
    @NotNull
    private Long productDetail;
    @NotNull
    private Long productSize;
    @Positive
    private int quantity;

    public OrderDetail toOrderDetail(ModelMapper mapper) {
        OrderDetail orderDetail = mapper.map(this, OrderDetail.class);
        orderDetail.setProduct(new Product().builder().productCode(productCode).build());
        orderDetail.setProductDetail(new ProductDetail().builder().id(productDetail).build());
        orderDetail.setProductSize(new ProductSize().builder().id(productSize).build());
        return orderDetail;
    }
}
