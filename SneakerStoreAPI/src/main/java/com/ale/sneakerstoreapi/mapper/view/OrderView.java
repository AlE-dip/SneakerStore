package com.ale.sneakerstoreapi.mapper.view;

import com.ale.sneakerstoreapi.entity.Order;
import com.ale.sneakerstoreapi.mapper.input.OrderDetailInput;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderView {
    private String orderNumber;
    private double total;
    private List<OrderDetailView> orderDetails;
    private String userUuid;

    public static OrderView newInstance(Order order, ModelMapper mapper){
        OrderView orderView = mapper.map(order, OrderView.class);
        return orderView;
    }
}
