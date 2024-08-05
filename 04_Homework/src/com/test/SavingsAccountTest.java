package com.test;

import java.util.*;

import com.model.CurrentAccount;
import com.model.SavingsAccount;

public class SavingsAccountTest {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		SavingsAccount account1 = new SavingsAccount();
		CurrentAccount account2 = new CurrentAccount();
		System.out.println("Enter Which you want: Press 1 for Savings & 2 for Current ");
		int input = scanner.nextInt();
		if(input==1) {
			System.out.println("Enter Account number of Account1: ");
			account1.setAccountNumber(scanner.nextInt());
			System.out.println("Enter Name of Account1 Holder: ");
			account1.setAccountName(scanner.next());
			System.out.println("Enter Balance of Account1: ");
			account1.setAccountBalance(scanner.nextInt());
			System.out.println("Enter Minimum Balance ");
			account1.setMin_balance(scanner.nextInt());
			
		}
		else {
			System.out.println("Enter Account number of Account1: ");
			account2.setAccountNumber(scanner.nextInt());
			System.out.println("Enter Name of Account1 Holder: ");
			account2.setAccountName(scanner.next());
			System.out.println("Enter Balance of Account1: ");
			account2.setAccountBalance(scanner.nextInt());
			System.out.println("Enter Over Draft Limit ");
			account2.setOver_draft_limit(scanner.nextInt());
		}
		{
		
		System.out.println("ATM Menu:\r\n" + "1. Check Balance\r\n" + "2. Deposit Money\r\n" + "3. Withdraw Money\r\n"
				+ "4. Exit \r \n" + "Please choose an option: ");
		Scanner input1 = new Scanner(System.in);
		int option = input1.nextInt();

		while (option < 4 && option != 0) {
			switch (option) {
			case 1:
				account1.checkBalance();
				System.out.println(account1.checkBalance());
				break;
			case 2:
				account1.deposit();
				break;
			case 3:
				account1.withdraw();
				break;
		
			}

		}// while
		}
		
	}

}
