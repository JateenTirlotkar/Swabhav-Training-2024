package com.model;

public class Account {
	private int accountNumber;
	private String accountName;
	private int accountBalance;
	private int deposit;
	private int withdraw;
	int d;
	int w;
	public Account(int accountNumber, String accountName, int accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	public Account() {
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public int checkBalance()
	{
		return accountBalance;
		
	}
	
	public void deposit() {
		if (d <= 0) {
			System.out.println("Deposit amount should be greater than 0");
		} else {
			deposit = d;
		}
		accountBalance = accountBalance + deposit;
		

}
	
	public void withdraw() {
		if (w <= 0 || w > accountBalance) {
			System.out.println("Not enough Balance");
		} else {
			withdraw = w;
		}
		accountBalance = accountBalance - withdraw;
	}
}
