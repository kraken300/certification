package com.ca.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(CounselorNotFound.class)
	public ResponseEntity<String> catchCounselorNotFound(CounselorNotFound counselorNotFound) {
		return new ResponseEntity<String>(counselorNotFound.getMessage(), HttpStatus.NOT_FOUND);
	}

}
