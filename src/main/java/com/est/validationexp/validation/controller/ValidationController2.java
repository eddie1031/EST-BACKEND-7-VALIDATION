package com.est.validationexp.validation.controller;

import com.est.validationexp.service.ValidationService;
import com.est.validationexp.validation.dto.SignInRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/v1/validates")
public class ValidationController2 {

    private final ValidationService service;

    @ResponseBody
    @GetMapping("/1")
    public String callService1(
//            @Valid @NotBlank String username,
            String username,
            @RequestParam(defaultValue = "pw1") String password
    ) {
        log.info("CONTROLLER!");
        log.info("username = {}", username);
        log.info("password = {}", password);

        service.enrollWithUsernameAndPassword(username, password);

        return "ok";
    }

    @ResponseBody
    @GetMapping("/2")
    public String callService2(
            @RequestParam(defaultValue = "false") Boolean isNg
    ) {
        SignInRequest signInRequest = getSignInRequest(isNg);
        service.signInProcess(signInRequest);
        return "ok";
    }

    private SignInRequest getSignInRequest(boolean isNg) {
        if ( !isNg ) {
            return new SignInRequest(
                    "user",
                    "user"
            );
        } else {
            return new SignInRequest();
        }
    }


}
