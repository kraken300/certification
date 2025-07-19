package com.sb.exception;

public class StudentNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7744693076244426273L;
	private String message;

	public StudentNotFoundException() {

	}

	public StudentNotFoundException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
