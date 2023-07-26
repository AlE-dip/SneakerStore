package com.ale.sneakerstoreapi.mapper.view.order;

import com.ale.sneakerstoreapi.entity.Order;
import com.ale.sneakerstoreapi.entity.OrderDetail;
import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
import com.ale.sneakerstoreapi.mapper.view.product.ProductDetailShortView;
import com.ale.sneakerstoreapi.mapper.view.product.ProductShortView;
import com.ale.sneakerstoreapi.mapper.view.product.ProductSizeShortView;
import com.ale.sneakerstoreapi.mapper.view.product.ProductSizeView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailView {

    private Long id;
    private ProductShortView product;
    private ProductDetailShortView productDetail;
    private ProductSizeShortView productSize;
    private int quantity;
    private double price;
    private double discount;

    public static OrderDetailView newInstance(OrderDetail orderDetail, ModelMapper mapper){
        OrderDetailView orderDetailView = mapper.map(orderDetail, OrderDetailView.class);
        return orderDetailView;
    }
}
