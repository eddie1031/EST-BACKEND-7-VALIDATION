package com.est.validationexp.validation.dto;

import com.est.validationexp.validation.validator.Phone;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignUpRequest {

    @NotBlank
    @Min(value = 4, message = "아이디는 최소 4글자를 입력해주세요!")
    private String username;

    @NotBlank
    @Min(value = 4, message = "비밀번호는 최소 4글자를 입력해주세요!")
    private String password;

    @NotBlank(message = "성함은 반드시 입력해주세요!")
    private String name;

    @Email(message = "올바른 이메일 형식으로 입력해주세요!")
    @NotBlank(message = "이메일은 반드시 입력되어야 합니다!")
    private String email;

    @Phone
    @NotBlank(message = "연락방식은 반드시 입력해주세요!")
    private String phone;

}
