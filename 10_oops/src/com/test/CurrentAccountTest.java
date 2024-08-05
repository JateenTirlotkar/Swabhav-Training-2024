package com.test;

import com.model.Account;
import com.model.CurrentAccount;
import com.model.SavingsAccount;

public class CurrentAccountTest {
	public static void main(String[] args) {
		CurrentAccount account1 = new CurrentAccount(12345, "Jateen", 1000, 500);
		System.out.println(account1.toString());
		
		SavingsAccount account2 = new SavingsAccount(12334, "John", 2000, 500);
		System.out.println(account2.toString());
	}

}
