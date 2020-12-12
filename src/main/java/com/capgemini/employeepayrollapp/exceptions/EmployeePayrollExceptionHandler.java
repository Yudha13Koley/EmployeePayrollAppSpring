package com.capgemini.employeepayrollapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capgemini.employeepayrollapp.dto.ResponseDTO;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;

@ControllerAdvice
public class EmployeePayrollExceptionHandler {

	@ExceptionHandler(ValueInstantiationException.class)
	public ResponseEntity<ResponseDTO> handleInvalidValueException(ValueInstantiationException exception) {
		ResponseDTO response = new ResponseDTO("Exception While Processing Http Request !", exception.getMessage());
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<ResponseDTO> handleEmployeeNotFoundException(ValidationException exception) {
		ResponseDTO response = new ResponseDTO("Exception While Processing Http Request !", exception.getMessage());
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.BAD_REQUEST);
	}
}
