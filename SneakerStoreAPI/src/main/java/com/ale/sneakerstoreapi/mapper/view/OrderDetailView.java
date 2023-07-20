package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.OrderDetail;
import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
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
    private String productName;
    private String productDescription;
    private String productCode;

    private String productDetailId;
    private ProductDetail.Color productColor;
    private String productImageUrl;
//    private List<String> imageUrlDetails;

    private String productSizeId;
    private ProductSize.Size productSize;

    private int quantity;
    private double price;
    private double discount;

    public static OrderDetailView newInstance(OrderDetail orderDetail, ModelMapper mapper){
        OrderDetailView orderDetailView = mapper.map(orderDetail, OrderDetailView.class);
        return orderDetailView;
    }
}
