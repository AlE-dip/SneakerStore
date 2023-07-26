package com.ale.sneakerstoreapi.mapper.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaypalOrder {
    private String intent;
    private List<PurchaseUnit> purchase_units;

    public static PaypalOrder newInstance(String total) {
        PaypalOrder paypalOrder = new PaypalOrder().builder()
                .intent("CAPTURE")
                .purchase_units(List.of(
                        PurchaseUnit.newInstance(total)
                ))
                .build();
        return paypalOrder;
    }
}
