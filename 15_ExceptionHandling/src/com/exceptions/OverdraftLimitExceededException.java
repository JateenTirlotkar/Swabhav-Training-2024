package com.exceptions;

public class OverdraftLimitExceededException extends RuntimeException {
	
	public String getMessage() {
		return "Invalid! Amount to be debited is greater than OverDraft Limit";
	}


}
