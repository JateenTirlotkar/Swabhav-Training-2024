package com.list.test;

import java.util.*;

import com.list.model.Account;

class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Account> accounts = new ArrayList<Account>();
		System.out.println("Enter the number of Accounts you want to create ");
		int input = scanner.nextInt();

		createAccounts(input, scanner, accounts);

		readAccounts(accounts);

		maxBalance(accounts);

		 sortAccounts(accounts);

	}

	private static void sortAccounts(List<Account> accounts) {
//		Account account1 = accounts.get(0);
		for (int i = 0; i < accounts.size() - 1; i++) {
			for (int j = i + 1; j < accounts.size(); j++) {
				if (accounts.get(i).getBalance() > accounts.get(j).getBalance()) {
				Account temp = accounts.get(i);
				accounts.set(i, accounts.get(j));
				accounts.set(j, temp);
				}
			}
		}
		System.out.println("Accounts in ascending order of Balance ");
		for(Account account:accounts)
		{
			System.out.println(accounts);
//			System.out.println(" ");
		}
		

	}

	public static void createAccounts(int input, Scanner scanner, List<Account> accounts) {
		for (int i = 0; i < input; i++) {
			System.out.println("Enter account ID ");
			int accountId = scanner.nextInt();
			System.out.println("Enter name ");
			String name = scanner.next();
			System.out.println("Enter account balance ");
			int balance = scanner.nextInt();
			accounts.add(new Account(accountId, name, balance));
		}
	}

	public static void readAccounts(List<Account> accounts) {
		for (Account account : accounts) {
			System.out.println(account);
		}
	}

	public static void maxBalance(List<Account> accounts) {
		Account MaxBalance = accounts.get(0);
		for (Account account : accounts) {
			if (account.getBalance() > MaxBalance.getBalance()) {
				MaxBalance = account;
			}
		}
		System.out.println("Max Balance account is ");
		System.out.println(MaxBalance);
	}
}
