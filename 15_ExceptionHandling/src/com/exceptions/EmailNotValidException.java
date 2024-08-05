package com.exceptions;

public class EmailNotValidException extends RuntimeException {
	public String getMessage() {
		return "Invalid Email Name";
	}

}
