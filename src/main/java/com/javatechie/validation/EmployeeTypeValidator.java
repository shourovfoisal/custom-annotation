package com.javatechie.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTypeValidator implements ConstraintValidator<ValidateEmployeeType, String> {

    @Override
    public boolean isValid(String employeeType, ConstraintValidatorContext constraintValidatorContext) {

        List<String> employeeTypes = Arrays.asList("Permanent", "Vendor");
        return employeeTypes.contains(employeeType);
    }
}
