package com.ale.sneakerstoreapi.mapper.view.order;

import com.ale.sneakerstoreapi.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderView {
    private String orderNumber;
    private double total;
    private String userUuid;
    private Instant date;
    private String approveUrl;
    private Order.PaymentStatus paymentStatus;
    private List<OrderDetailView> orderDetails;

    public static OrderView newInstance(Order order, ModelMapper mapper){
        OrderView orderView = mapper.map(order, OrderView.class);
        orderView.userUuid = order.getUser().getUuid().toString();
        return orderView;
    }
}
