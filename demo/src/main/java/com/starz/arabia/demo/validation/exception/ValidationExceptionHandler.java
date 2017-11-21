package com.starz.arabia.demo.validation.exception;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.starz.arabia.demo.dto.ErrorDTO;

@ControllerAdvice
@Component
public class ValidationExceptionHandler {
	
	@ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorDTO processValidationError(ConstraintViolationException ex) {
		return new ErrorDTO("Invalid Params...");      
    }

}
