package com.ale.sneakerstoreapi.mapper.input;

import com.ale.sneakerstoreapi.entity.Paypal;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaypalInput {
    @NotBlank
    private String clientId;
    @NotBlank
    private String secret;

    public Paypal toPaypal(ModelMapper mapper) {
        Paypal paypal = mapper.map(this, Paypal.class);
        return paypal;
    }
}
