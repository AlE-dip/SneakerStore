package com.ale.sneakerstoreapi.mapper.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaypalOrder {
    private String intent;
    private List<PurchaseUnit> purchase_units;
    private Map<String, String> application_context;

    public static PaypalOrder newInstance(String total) {
        Map<String, String> map = new HashMap<>();
        map.put("return_url", "https://example.com/return");
        map.put("cancel_url", "https://example.com/cancel");
        PaypalOrder paypalOrder = new PaypalOrder().builder()
                .intent("CAPTURE")
                .purchase_units(List.of(
                        PurchaseUnit.newInstance(total)
                ))
                .application_context(map)
                .build();
        return paypalOrder;
    }
}
