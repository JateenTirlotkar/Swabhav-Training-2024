package com.test;

import java.util.Scanner;

import com.model.BankAccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account number of Account1: ");
		b1.setAccountNumber(sc.nextInt());
		System.out.println("Enter Name of Account1 Holder: ");
		b1.setName(sc.next());
		System.out.println("Enter Balance of Account1: ");
		b1.setBalance(sc.nextInt());

		System.out.println("Details of Account1: ");
		System.out.println("Account number: " + b1.getAccountNumber());
		System.out.println("Account Holder Name: " + b1.getName());
		System.out.println("Balance: " + b1.getBalance());

		System.out.println("Do you want to deposit money: (yes/no) ");
		String input = sc.next();
		if (input.equals("yes")) {
			System.out.println("Enter Amount to be depositted");
			b1.deposit(sc.nextInt());
			System.out.println("Balance: " + b1.getBalance());
		}

		System.out.println("Do you want to Withdraw Money: (yes/no) ");
		String input1 = sc.next();
		if (input1.equals("yes")) {
			System.out.println("Enter Amount to be withdrawn");
			b1.withdraw(sc.nextInt());
			System.out.println("Balance: " + b1.getBalance());
		}
		
		
		BankAccount b2=new BankAccount();
		System.out.println("Enter Account number of Account2: ");
		b2.setAccountNumber(sc.nextInt());
		System.out.println("Enter Name of Account2 Holder: ");
		b2.setName(sc.next());
		System.out.println("Enter Balance of Account2: ");
		b2.setBalance(sc.nextInt());	
		
		System.out.println("Details of Account2: ");
		System.out.println("Account number: " + b2.getAccountNumber());
		System.out.println("Account Holder Name: " + b2.getName());
		System.out.println("Balance: " + b2.getBalance());
		
		System.out.println("Do you want to deposit money: (yes/no) ");
		String input2 = sc.next();
		if (input2.equals("yes")) {
			System.out.println("Enter Amount to be depositted");
			b2.deposit(sc.nextInt());
			System.out.println("Balance: " + b2.getBalance());
		}

		System.out.println("Do you want to Withdraw Money: (yes/no) ");
		String input3 = sc.next();
		if (input3.equals("yes")) {
			System.out.println("Enter Amount to be withdrawn");
			b2.withdraw(sc.nextInt());
			System.out.println("Balance: " + b2.getBalance());
		}
		
		
		sc.close();

	}

}
