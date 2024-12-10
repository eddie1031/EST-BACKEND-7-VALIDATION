package com.est.validationexp.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator implements ConstraintValidator<Phone, String> {

    @Override
    public boolean isValid(String inputValue, ConstraintValidatorContext constraintValidatorContext) {

        Pattern regexPattern = Pattern.compile("^010-[0-9]{4}-[0-9]{4}");
        Matcher matcher = regexPattern.matcher(inputValue);

        try {
            return matcher.matches();
        } catch ( Exception e ) {
            return false;
        }
    }

}
