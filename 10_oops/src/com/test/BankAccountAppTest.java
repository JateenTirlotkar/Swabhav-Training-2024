package com.test;

import java.util.Random;
import java.util.Scanner;
import com.model.BankAccountApp;

public class BankAccountAppTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Enter the number of accounts to create: ");
        int n = sc.nextInt();
        
        BankAccountApp[] accounts = new BankAccountApp[n];
        
        for (int i = 0; i < n; i++) {
            accounts[i] = new BankAccountApp();
            long accountNumber = 100000000000L + (long)(rand.nextDouble() * 900000000000L); // Generate random 12-digit account number
            accounts[i].setAccountNumber(accountNumber);
            System.out.println("Enter Name of Account " + (i + 1) + " Holder: ");
            accounts[i].setName(sc.next());
            
            System.out.println("Details of Account " + (i + 1) + ": ");
            System.out.println("Account number: " + accounts[i].getAccountNumber());
            System.out.println("Account Holder Name: " + accounts[i].getName());
            System.out.println("Balance: " + accounts[i].getBalance());
            
            System.out.println("Do you want to deposit money: (yes/no) ");
            String input = sc.next();
            if (input.equalsIgnoreCase("yes")) {
                System.out.println("Enter Amount to be deposited");
                accounts[i].deposit(sc.nextInt());
                System.out.println("Balance: " + accounts[i].getBalance());
            }

            System.out.println("Do you want to withdraw money: (yes/no) ");
            String input1 = sc.next();
            if (input1.equalsIgnoreCase("yes")) {
                System.out.println("Enter Amount to be withdrawn");
                accounts[i].withdraw(sc.nextInt());
                System.out.println("Balance: " + accounts[i].getBalance());
            }
        }
        
        sc.close();
        
        BankAccountApp maxBalanceAccount = getMaximumBalanceAccount(accounts);
        System.out.println("Account with the maximum balance: ");
        System.out.println("Account number: " + maxBalanceAccount.getAccountNumber());
        System.out.println("Account Holder Name: " + maxBalanceAccount.getName());
        System.out.println("Balance: " + maxBalanceAccount.getBalance());
    }

    public static BankAccountApp getMaximumBalanceAccount(BankAccountApp[] accounts) {
        BankAccountApp maxBalanceAccount = accounts[0];
        for (BankAccountApp account : accounts) {
            if (account.getBalance() > maxBalanceAccount.getBalance()) {
                maxBalanceAccount = account;
            }
        }
        return maxBalanceAccount;
    }
}
