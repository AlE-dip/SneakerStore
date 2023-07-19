package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.Order;
import com.ale.sneakerstoreapi.mapper.input.OrderDetailInput;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderView {
    private Long id;
    private String orderNumber;
    private double total;
    private List<OrderDetailView> orderDetails;
    private String userId;

//    public static OrderView newInstance(Order order){
//        return new OrderView().builder()
//                .id(order.getId().toString())
//                .orderNumber(order.getOrderNumber())
//                .total(order.getTotal())
//                .orderDetails(order.getOrderDetails().stream()
//                        .map(OrderDetailView::newInstance)
//                        .toList()
//                )
//                .userId(order.getUser().getId().toString())
//                .build();
//    }
}
