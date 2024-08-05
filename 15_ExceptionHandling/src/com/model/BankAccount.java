package com.model;
import com.exceptions.MinimumBalanceException;

public class BankAccount  {
	private int accountNo;
	private String name;
	private double balance;

	public BankAccount(int accountNo, String name, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void credit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Amount credited: " + amount);
		} else {
			System.out.println("Invalid amount. Please enter a positive value.");
		}
	}

	public void debit(double amount) {
		// To be overridden by subclasses
	}

	public void checkBalance() {
		System.out.println("Current balance: " + balance);
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + "]";
	}
}
