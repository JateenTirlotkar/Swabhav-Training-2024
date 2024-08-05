package factory.model;

public class Current implements IAccount {
	int balance = 2000;
	private String name;
	private int accountNumber;
	private int overDraftLimit;
	public Current(String name, int accountNumber, int overDraftLimit) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.overDraftLimit = overDraftLimit;
		
	}

	private AccountType accountType;

	@Override
	public int credit(int amount) {
		balance += amount;
		// TODO Auto-generated method stub
		return balance;

	}

	@Override
	public int debit(int amount) {
		balance += amount;
		// TODO Auto-generated method stub
		return balance;
	}

	public int checkBalance() {
		return balance;

	}

}
