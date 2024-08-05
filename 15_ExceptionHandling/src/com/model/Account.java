package com.model;

import com.exceptions.InsufficientBalanceException;

public class Account {
	private int accountNumber;
	private String name;
	private int balance;
	

	public Account(int accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int credit(int credit) {
		balance = balance + credit;
		System.out.println("Remaining balance is " + balance);
		return balance;
	}

	public int debit(int debit) {
		if (balance < debit)
			throw new InsufficientBalanceException(balance);
		balance -= debit;
		System.out.println("Remaining balance is " + balance);
		return balance;
	}

}
