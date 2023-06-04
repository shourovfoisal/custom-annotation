package com.javatechie.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeTypeValidator.class)
public @interface ValidateEmployeeType {
    public String message() default "Invalid Employee Type. Should be either Permanent or Vendor.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
