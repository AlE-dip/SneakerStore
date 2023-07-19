package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.OrderDetail;
import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailView {

    private Long id;
    private String productId;
    private String productName;
    private String productDescription;
    private String productCode;

    private String productDetailId;
    private ProductDetail.Color productColor;
    private String imageUrl;
    private List<String> imageUrlDetails;

    private String productSizeId;
    private ProductSize.Size productSize;

    private int quantity;
    private double price;
    private double discount;

//    public static OrderDetailView newInstance(OrderDetail orderDetail){
//        return new OrderDetailView().builder()
//                .id(orderDetail.getId().toString())
//                .productId(orderDetail.getProduct().getId().toString())
//                .productName(orderDetail.getProduct().getName())
//                .productDescription(orderDetail.getProduct().getDescription())
//                .productCode(orderDetail.getProduct().getProductCode())
//                .productDetailId(orderDetail.getProductDetail().getId().toString())
//                .productColor(orderDetail.getProductDetail().getColor())
//                .imageUrl(orderDetail.getProductDetail().getImageUrl())
////                .imageUrlDetails(orderDetail.getProductDetail().getImageUrlDetails())
//                .productSizeId(orderDetail.getProductSize().getId().toString())
//                .productSize(orderDetail.getProductSize().getSize())
//                .quantity(orderDetail.getQuantity())
//                .price(orderDetail.getPrice())
//                .discount(orderDetail.getDiscount())
//                .build();
//    }
}
