package com.example.actuator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//using @ResponseStatus to define Custom Exception and set the HTTP statusCode	

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CustomException() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomException(String message) {
		super(message);
	}
}
