package com.model;

public class BankAccountApp {
    private long accountNumber;
    private String name;
    private int balance;

    public BankAccountApp() {
        this.balance = 1000;  // Set initial balance to 1000
    }

    public BankAccountApp(long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 1000;  // Set initial balance to 1000
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount should be greater than 0");
        } else {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Not enough balance");
        } else {
            balance -= amount;
        }
    }
}
