package com.daytwo;

import java.util.Scanner;

public class Comparison_Operators {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first integer value: ");
		int a = sc.nextInt();

		System.out.print("Enter second integer value: ");
		int b = sc.nextInt();

		boolean isEqual = (a == b);
		boolean notEqual = (a != b);
		boolean lessThan = (a < b);
		boolean lessThanOrEqual = (a <= b);
		boolean greaterThan = (a > b);
		boolean greaterThanOrEqual = (a >= b);

		System.out.println("Results:");
		System.out.println(a + " == " + b + " : " + isEqual);
		System.out.println(a + " != " + b + " : " + notEqual);
		System.out.println(a + " < " + b + " : " + lessThan);
		System.out.println(a + " <= " + b + " : " + lessThanOrEqual);
		System.out.println(a + " > " + b + " : " + greaterThan);
		System.out.println(a + " >= " + b + " : " + greaterThanOrEqual);

	}

}
