package com.model;

public class BankAccount {
	private int accountNumber;
	private String name;
	private int balance;
	private int deposit = 0;
	private int withdraw = 0;
	
	
	public BankAccount()
	{
			}
	
	public BankAccount(int a, String n, int b)
	{
		int accountNumber = a;
		 String name = n;
		 int balance = b;

	}

	public void setAccountNumber(int a) {
		accountNumber = a;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setBalance(int b) {
		balance = b;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int d) {
		if (d <= 0) {
			System.out.println("Deposit amount should be greater than 0");
		} else {
			deposit = d;
		}
		balance = balance + deposit;

	}

	public void withdraw(int w) {
		if (w <= 0 || w > balance) {
			System.out.println("Not enough Balance");
		} else {
			withdraw = w;
		}
		balance = balance - withdraw;
	}

}
