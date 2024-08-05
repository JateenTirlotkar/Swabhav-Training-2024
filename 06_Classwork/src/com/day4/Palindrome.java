package com.day4;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;

		int rev = 0;
		int cube = 0;
		int rem = 0;
		int pow = 0;
		while (number > 0) {
			pow++;
			number = number / 10;
		}
		number = temp;

		while (number > 0) {
			rem = number % 10;
			rev=rev*10+rem;
			number=number/10;
		}
		
		if(rev==temp) {
		System.out.println("Number is palindrome");
		}
	}

}
