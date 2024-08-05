package com.model;

import com.exceptions.OverdraftLimitExceededException;

public class CurrentAccount extends BankAccount{

	private double OVER_DRAFT_LIMIT;
	public CurrentAccount(int accountNo, String name, double balance, double OVER_DRAFT_LIMIT) {
		super(accountNo, name, balance);
		this.OVER_DRAFT_LIMIT =OVER_DRAFT_LIMIT;
	}
	
	@Override
	public String toString() {
		return "CurrentAccount [OVER_DRAFT_LIMIT=" + OVER_DRAFT_LIMIT + ", AccountNo=" + getAccountNo()
				+ ", Name=" + getName() + ", Balance=" + getBalance() +  "]";
	}


	@Override
	public void debit(double amount) {
		if(amount > 0) {
			if(getBalance() - amount >= -OVER_DRAFT_LIMIT) {
				setBalance(getBalance() - amount);
				System.out.println("Amount Debited: "+amount+ " Total Balance : " +getBalance());
				return;
			}
			throw new OverdraftLimitExceededException();
//;			System.out.println("Overdraft limit exceeded. Cannot debit amount");
			
		}
		System.out.println("Invalid amount. Please enter valid amount");
	}
	
	

}