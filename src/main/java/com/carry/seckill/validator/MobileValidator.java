package com.carry.seckill.validator;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidator implements ConstraintValidator<IsMobile, String> {
    private boolean required = false;
    private static final Pattern mobile_pattern = Pattern.compile("1\\d{10}");
    @Override
    public void initialize(IsMobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (!required && !StringUtils.hasLength(s)) {
            return true;
        } else {
            if (!StringUtils.hasLength(s)) {
                return false;
            }
            Matcher m = mobile_pattern.matcher(s);
            return m.matches();
        }
    }
}
