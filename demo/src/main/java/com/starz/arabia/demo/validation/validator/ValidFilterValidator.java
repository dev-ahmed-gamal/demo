package com.starz.arabia.demo.validation.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.starz.arabia.demo.data.DataCollection;
import com.starz.arabia.demo.validation.annotation.ValidFiltter;

@Component
public class ValidFilterValidator implements ConstraintValidator<ValidFiltter, String>{

	@Override
	public void initialize(ValidFiltter arg) {
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext ctx) {
		if (value == null) 
			return true;
		else if (DataCollection.filtersMap.containsKey(value) || value.equalsIgnoreCase("") || value.isEmpty() ) 
			return true;
		return false;

	}

}
