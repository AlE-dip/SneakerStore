package com.ale.sneakerstoreapi.mapper.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseUnit {
    private Amount amount;

    public static PurchaseUnit newInstance(String price){
        return new PurchaseUnit().builder()
                .amount(Amount.newInstance(price))
                .build();
    }
}