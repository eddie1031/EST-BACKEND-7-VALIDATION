package com.est.validationexp.validation.controller;

import com.est.validationexp.validation.dto.OrderRequest;
import com.est.validationexp.validation.dto.SignUpRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/validates")
public class ValidationController1 {

    @GetMapping("1")
    public String showPage1() {
        return "/validation_form/page1";
    }

    @PostMapping("1")
    public String processPage1(HttpServletRequest request) {

        String name = request.getParameter("name");
        log.info("name = {}", name);

        if ( name.isBlank() || name.isEmpty() ) {
            return "redirect:/";
        }

        return "redirect:/validates/1";
    }

    @GetMapping("2")
    public String showPage2() {
        return "/validation_form/page2";
    }

    @PostMapping("2")
    public String processPage2(@Valid OrderRequest orderRequest) {
        return "/validation_form/page2";
    }

    @GetMapping("/3")
    public String showPage3() {
        return "/validation_form/page3";
    }

    @PostMapping("/3")
    public String processPage3(@Valid SignUpRequest signUpRequest) {
        log.info("signUpRequest = {}", signUpRequest);
        return "/validation_form/page3";
    }

}
