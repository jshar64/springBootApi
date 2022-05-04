package com.springboot.demo.crud.advice;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springboot.demo.crud.exceptions.EmptyInputException;

@ControllerAdvice
public class EmployeeControllerAdvice {

	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleNullInput(EmptyInputException emptyInputException) {

		return new ResponseEntity<String>("Please Enter the value", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoElementException(NoSuchElementException noSuchElementException) {
		return new ResponseEntity<String>("No value is present in Database", HttpStatus.NOT_FOUND);
	}
}
