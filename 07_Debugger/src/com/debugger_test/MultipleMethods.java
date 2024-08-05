package com.debugger_test;

public class MultipleMethods {
	public static void main(String[] args) {
		int num1=4;
		int num2=6;
		int sum=0;
		long b =10+10;
		
		
		addition(num1,num2);
		multiplication( num1,  num2, sum);
		
	}

	private static void multiplication(int num1, int num2,int sum) {
		division(num1,num2);
		System.out.println("Multiplication: " + (sum =num1 * num2));
		
	}

	private static void division(int num1, int num2) {
		System.out.println("Division is : " + (num1 / num2));
		
	}

	private static void addition(int num1, int num2) {
		
		substraction(num1,num2);
		System.out.println("Addition is: " + (num1 + num2));
		
		
		
	}

	private static void substraction(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("Substraction is: " + (num1 - num2));
	}
	
	

}
