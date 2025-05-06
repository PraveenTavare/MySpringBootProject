package com.example.actuator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//To handle exception Globally using @ControllerAdvice
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAllException(Exception ex) {
		
		return new ResponseEntity<>(" An ERROR occurred:  " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR); 	
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
		return new ResponseEntity<String>("Illegal Argument" + ex.getMessage(), HttpStatus.NOT_FOUND);
	}
}
