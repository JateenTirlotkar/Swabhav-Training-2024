package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		List<Account> account = new ArrayList<>();
		account.add(new Account(1, "Jateen", 1000));
		account.add(new Account(2, "Gabriel", 4000));
		account.add(new Account(1, "Atkin", 87000));
		account.add(new Account(1, "Snow", 9000));

		System.out.println(account);
		System.out.println();

		Optional<Account> min_balance = account.stream()
				.min((account1, account2) -> account1.getBalance() - account2.getBalance());
		System.out.println("Min balance is " + min_balance);
		System.out.println();

		Optional<Account> max_balance = account.stream()
				.max((account1, account2) -> account1.getBalance() - account2.getBalance());
		System.out.println("Max balance is " + max_balance);
		System.out.println();

		List<Account> accNames = account.stream().filter(name -> name.getName().length() <= 6)
				.collect(Collectors.toList());

		System.out.println(accNames);
		System.out.println();

		// int sum = numbers.stream().reduce(0, (number1,number2)->number1+number2);

		int sum = account.stream().map(accounts -> accounts.getBalance()).reduce(0,
				(account1, account2) -> account1 + account2);
		System.out.println("Sum of Total balance " + sum);

	}

}
