package com.example.demo.globalexceptionhandler;

import java.util.NoSuchElementException;

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
	public String handleaNoResourceFoundException(org.springframework.web.servlet.resource.NoResourceFoundException e) {
		return "Page Not Found";
	}
	@RestControllerAdvice
	public class GlobalExceptionHandler {

	    @ExceptionHandler(NoSuchElementException.class)
	    public String handleNoSuchElementException(NoSuchElementException ex) {
	        return ex.getMessage();
	    }

	    // other exception handlers...
	}

	
}
