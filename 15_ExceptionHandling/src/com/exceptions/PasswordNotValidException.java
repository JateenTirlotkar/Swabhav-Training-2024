package com.exceptions;

public class PasswordNotValidException extends RuntimeException {
	public String getMessage() {
		return "Invalid Password";
	}

}
