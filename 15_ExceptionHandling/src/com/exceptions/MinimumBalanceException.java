package com.exceptions;

public class MinimumBalanceException extends RuntimeException {
	public String getMessage() {
		return "Invalid! Amount to be debited is greater than minimum Balance";
	}

}
