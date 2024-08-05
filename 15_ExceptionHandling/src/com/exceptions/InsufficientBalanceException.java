package com.exceptions;

public class InsufficientBalanceException extends RuntimeException {
	private int balance;

	public InsufficientBalanceException(int balance) {
		super();
		this.balance = balance;
	}
	
	public String getMessage()
	{
		return "Invalid!!! Insufficeient Balance.";
	}
	

}
