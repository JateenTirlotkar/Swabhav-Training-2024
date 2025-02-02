package Observer.model;

import java.util.ArrayList;
import java.util.List;

import InsufficientFundsException.InsufficientFundsException;

public class Account {
	private int accountNumber;
	private String name;
	private int balance;
	private List<INotifier> notifiers;
	public Account(int accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = new ArrayList<INotifier>();
		
	}
	
	public int deposit(int amount) {
		balance=balance+amount;
		
		notifiers.forEach(n->n.notify(this));
		return balance;
	}
	public int withdraw(int amount) {
		
		if(amount>balance) {
			
			notifiers.forEach(n->n.error(this));
		}
		balance= balance-amount;
		System.out.println("Your balance is: "+ balance);
		
		return balance;
			
	}
	
	public void registerNotifier(INotifier notifier) {
		notifiers.add(notifier);
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers + "]";
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
	public List<INotifier> getNotifiers() {
		return notifiers;
	}
	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}

}
