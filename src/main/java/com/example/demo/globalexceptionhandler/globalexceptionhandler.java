package com.example.demo.globalexceptionhandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.utility.RequestStatus;

@RestControllerAdvice
public class globalexceptionhandler {
	@ExceptionHandler(UserNotFoundException.class)
	public RequestStatus handleUserNotFoundException(UserNotFoundException ue){
		return new RequestStatus(ue.getMessage(),200);
	}
	@ExceptionHandler(org.springframework.web.servlet.resource.NoResourceFoundException.class)
	public String handleNoResourceFoundException(org.springframework.web.servlet.resource.NoResourceFoundException e) {
		return "Page Not Found";
	}
	
}
