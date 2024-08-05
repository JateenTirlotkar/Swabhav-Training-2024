package com.model;

public class Account {
	private long accountNumber;
    private String name;
    private int balance;
    private AccountType accounttype;
	public Account(long accountNumber, String name, int balance, AccountType accounttype) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.accounttype = accounttype;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", accounttype="
				+ accounttype + "]";
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public AccountType getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(AccountType accounttype) {
		this.accounttype = accounttype;
	}

}
