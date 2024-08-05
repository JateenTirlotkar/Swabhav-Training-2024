package com.dayfour;

import java.util.Scanner;

public class AtmSimulator {
	public static void main(String[] args) {
		int total_balance = 1000;
		int deposit = 0;
		int withdraw = 0;
		System.out.println("ATM Menu:\r\n" + "1. Check Balance\r\n" + "2. Deposit Money\r\n" + "3. Withdraw Money\r\n"
				+ "4. Exit \r \n" + "Please choose an option: ");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();

		while (option < 4 && option != 0) {
			switch (option) {
			case 1:
				check_Balance(total_balance);
				break;
			case 2:
				deposit_money(deposit, total_balance);
				break;
			case 3:
				withdraw_money(withdraw, total_balance);
				break;
		
			}

		} // while
	}// main

	public static void check_Balance(int total_balance) {
		System.out.println("Your Current Balance is: " + total_balance);
		

	}

	public static int deposit_money(int deposit, int total_balance) {
		System.out.println("Enter amount to deposit: ");
		Scanner sc = new Scanner(System.in);
		deposit = sc.nextInt();
		total_balance = total_balance + deposit;
		System.out.println("You have deposited $" + deposit + " Your new balance is $" + total_balance);
		return deposit;

	}

	public static int withdraw_money(int withdraw, int total_balance) {
		System.out.println("Enter amount to withdraw: ");
		Scanner sc1 = new Scanner(System.in);
		withdraw = sc1.nextInt();
		total_balance = total_balance - withdraw;
		System.out.println("You have withdrawn $" + withdraw + " Your new balance is $" + total_balance);
		return withdraw;

	}

}
