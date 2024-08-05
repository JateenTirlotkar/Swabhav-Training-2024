package com.daytwo;

import java.util.Scanner;

public class Arithmatic_Operators {
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int first_number = sc.nextInt();
		int second_number = sc.nextInt();
		
		System.out.println("Addition of two numbers is: " + addition(first_number,second_number));
		System.out.println("Substraction of two numbers is: " + substraction(first_number,second_number));
		System.out.println("Multiplication of two numbers is: " + multiplication(first_number,second_number));
		System.out.println("Division of two numbers is: " + division(first_number,second_number));
		System.out.println("Modulus of two numbers is: " + modulus(first_number,second_number));
	}

	public static int addition(int first_number, int second_number) {
		return first_number + second_number;
	}
	public static int substraction(int first_number, int second_number) {
		return first_number - second_number;
	}
	public static int multiplication(int first_number, int second_number) {
		return first_number * second_number;
	}
	public static int division(int first_number, int second_number) {
		return first_number / second_number;
	}
	public static int modulus(int first_number, int second_number) {
		return first_number % second_number;
	}
	
	

	
	
	
	
	
	
}
