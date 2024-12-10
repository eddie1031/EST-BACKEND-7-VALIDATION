package com.est.validationexp.validation.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class OrderRequest {

    @NotBlank
    private String itemColor;

    private List<String> itemOption;

    @NotBlank
    private String deliveryOption;

    @Min(value = 1)
    private int amount;

    private String detail;

}
