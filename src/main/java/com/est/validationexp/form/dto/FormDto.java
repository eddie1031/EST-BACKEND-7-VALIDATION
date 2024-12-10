package com.est.validationexp.form.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class FormDto {

    private String username;
    private String password;

    private String email;

//    private LocalDate formDate1;
    private LocalDate form_date_1;

    private LocalDateTime form_date_2;

}
