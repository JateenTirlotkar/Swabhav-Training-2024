package factory.model;

public class Savings implements IAccount{
	private String name;
	private int accountNumber;
	private int min_balance;
	private AccountType accountType;
	public Savings(String name, int accountNumber, int min_balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.min_balance = min_balance;
	}
	int balance = 1000;

	@Override
	public int credit(int amount) {
		
		 min_balance += amount;
		// TODO Auto-generated method stub
		return min_balance;
	}

	@Override
	public int debit(int amount) {
		min_balance -=amount;
		// TODO Auto-generated method stub
		return min_balance;
	}
	public int checkBalance() {
		return min_balance;
		
	}

	

}
