package com.est.validationexp.form.controller;

import com.est.validationexp.form.dto.FormDto;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/forms")
public class FormController {

    @GetMapping("/1")
    public String showForm1() {
        return "forms/form1";
    }

    @PostMapping("/1")
    public String processForm1(HttpServletRequest req) {

        String number = req.getParameter("form_number");
        String text = req.getParameter("form_text");
        String date = req.getParameter("form_date");
        String range = req.getParameter("form_range");

        log.info("number = {}", number);
        log.info("text = {}", text);
        log.info("date = {}", date);
        log.info("range = {}", range);

        return "redirect:/forms/1";
    }

    @GetMapping("/2")
    public String showForm2() {
        return "forms/form2";
    }

    @PostMapping("/2")
    public String processForm2(
//            @ModelAttribute FormDto formDto
            FormDto formDto
    ) {
        log.info("formDto = {}", formDto);
        return "redirect:/forms/2";
    }


}
