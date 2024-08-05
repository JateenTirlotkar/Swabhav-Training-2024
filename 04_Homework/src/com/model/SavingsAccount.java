package com.model;

public class SavingsAccount extends Account {
	private int min_balance;
	
	
	public SavingsAccount() {
		
	}
	public SavingsAccount(int accountNumber, String accountName, int accountBalance, int min_balance) {
		super(accountNumber, accountName, accountBalance);
		this.min_balance = min_balance;
	}

	public int getMin_balance() {
		return min_balance;
	}

	public void setMin_balance(int min_balance) {
		this.min_balance = min_balance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [min_balance=" + min_balance + ", AccountNumber()=" + getAccountNumber()
				+ ", AccountName()=" + getAccountName() + ", AccountBalance()=" + getAccountBalance();
	}

}
