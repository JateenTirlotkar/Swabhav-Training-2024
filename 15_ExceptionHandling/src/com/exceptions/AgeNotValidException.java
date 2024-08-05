package com.exceptions;

public class AgeNotValidException extends RuntimeException {
	private int age;

	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}

	public String getMessage() {
		return "Age not Valid. Age must be less than 18 You have entered age: "+ age;
	}

}
