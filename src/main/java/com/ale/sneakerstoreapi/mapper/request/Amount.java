package com.ale.sneakerstoreapi.mapper.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Amount {
    private String currency_code;
    private String value;

    public static Amount newInstance(String price) {
        return new Amount().builder()
                .currency_code("USD")
                .value(price)
                .build();
    }
}