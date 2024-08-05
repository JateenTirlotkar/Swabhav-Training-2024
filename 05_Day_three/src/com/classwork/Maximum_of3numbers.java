package com.classwork;

import java.util.Scanner;

public class Maximum_of3numbers {
	public static void main(String[] args) {
		System.out.println("Enter 3 numbers");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();

		if ((number1 > number2) && (number1 > number3)) {
			System.out.println("Number 1 is maximum");
		} else if ((number2 > number1) && (number2 > number3)) {
			System.out.println("Number 2 is maximum");
		} else {
			System.out.println("Number 3 is maximum");
		}
	}

}
