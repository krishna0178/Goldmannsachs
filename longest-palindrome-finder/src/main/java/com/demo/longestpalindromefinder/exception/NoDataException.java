package com.demo.longestpalindromefinder.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class NoDataException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String DEFAULT_MESSAGE = "No data for input";

	public NoDataException(String message){
		super(message);
	}
	
	public NoDataException(){
		super(DEFAULT_MESSAGE);
	}
	
	public NoDataException(Throwable cause){
		super(cause);
	}
	
	public NoDataException(String message, Throwable cause) {
		super(message, cause);
	}
}
