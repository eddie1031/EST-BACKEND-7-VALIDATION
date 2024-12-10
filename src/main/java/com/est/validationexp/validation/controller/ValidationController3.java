package com.est.validationexp.validation.controller;

import com.est.validationexp.validation.dto.HtmlForm;
import com.est.validationexp.validation.dto.UserRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/validates/e")
public class ValidationController3 {

    @GetMapping("/1")
    public String showPage1() {
        return "/validation_exception/page1";
    }

    @PostMapping("/1")
    public String processPage1(
            UserRequest req
    ) {

        String name = req.getName();
        String email = req.getEmail();

        if( name.isBlank() || name.isEmpty() ) {
            return "redirect:/validates/e/1?err=true&code=1";
        }

        if( email.isBlank() || email.isEmpty() ) {
            return "redirect:/validates/e/1?err=true&code=1";
        }

        return "redirect:/validates/e/1";
    }

    @GetMapping("/2")
    public String showPage2(Model model) {
        model.addAttribute("htmlForm", new HtmlForm());
        return "/validation_exception/page2";
    }

    @PostMapping("/2")
    public String processPage2(
            @Valid HtmlForm form, BindingResult bindingResult
    ) {
        log.info("form = {}", form);

        if ( bindingResult.hasErrors() ) {
//            List<ObjectError> allErrors = bindingResult.getAllErrors();
//            for (ObjectError error : allErrors) {
//                log.info("error.getCode() = {}", error.getCode());
//                log.info("error.getDefaultMessage() = {}", error.getDefaultMessage());
//            }
            return "/validation_exception/page2";
        }

        return "redirect:/";
    }

//    @PostMapping("/2")
    public String processPage2_1(
            @Valid HtmlForm form, Model model, BindingResult bindingResult
    ) {

        if ( bindingResult.hasErrors() ) {
            return "redirect:/validates/e/1?err=true&code=1";
        }

        return "redirect:/";
    }

    @GetMapping("/3")
    public String showPage3() {
        return "/validation_exception/page3";
    }

    @PostMapping("/3")
    public String processPage3(
            HtmlForm form, BindingResult bindingResult
    ) {

        if ( form.getText().isBlank() ) {
//            bindingResult.addError(
////                    new FieldError()
//            );
        }

        return "/validation_exception/page3";
    }

}
