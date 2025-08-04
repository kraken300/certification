package com.ca.exception;

public class CounselorNotFound extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5710550425169859616L;
	private String message;

	public CounselorNotFound() {

	}

	public CounselorNotFound(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}
