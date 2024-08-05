package com.model;

public class CurrentAccount extends Account {
	private int over_draft_limit;
	
	public CurrentAccount() {
		
	}

	public CurrentAccount(int accountNumber, String accountName, int accountBalance, int over_draft_limit) {
		super(accountNumber, accountName, accountBalance);
		this.over_draft_limit = over_draft_limit;
	}

	public int getOver_draft_limit() {
		return over_draft_limit;
	}

	public void setOver_draft_limit(int over_draft_limit) {
		this.over_draft_limit = over_draft_limit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [over_draft_limit=" + over_draft_limit + ", AccountNumber()=" + getAccountNumber()
				+ ", AccountName()=" + getAccountName() + ", AccountBalance()=" + getAccountBalance()
				;
	}
	

}
