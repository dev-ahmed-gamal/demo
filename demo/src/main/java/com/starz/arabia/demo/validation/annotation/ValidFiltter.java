package com.starz.arabia.demo.validation.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.starz.arabia.demo.validation.validator.ValidFilterValidator;

@Constraint(validatedBy = ValidFilterValidator.class)
@Target( {  ElementType.TYPE, ElementType.METHOD, ElementType.FIELD , ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface ValidFiltter {

	String message() default "{ValidValue}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}