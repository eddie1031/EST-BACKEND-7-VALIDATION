package com.est.validationexp.service;

import com.est.validationexp.validation.dto.SignInRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Service
@Validated
public class ValidationService {

    public void enrollWithUsernameAndPassword(
            @Valid @NotBlank String username, @Valid @NotBlank String password
    ) {
        log.info("SERVICE!");
        log.info("username = {}", username);
        log.info("password = {}", password);
    }

    public void signInProcess(
            @Valid SignInRequest signInRequest
    ) {
        log.info("signInRequest = {}", signInRequest);
    }


}
