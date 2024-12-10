package com.est.validationexp.validation.dto;

import com.est.validationexp.validation.validator.Phone;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class HtmlForm {

    @NotBlank
    private String text;

    @Email
    @NotBlank
    private String email;

    @Phone
    private String phone;

    @Past
    @NotNull
    private LocalDate localDate;

}
