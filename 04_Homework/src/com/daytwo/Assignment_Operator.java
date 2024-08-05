package com.daytwo;
import java.util.Scanner;

public class Assignment_Operator {
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int number1= sc.nextInt();
		int number2 = sc.nextInt();
		
		System.out.println("Assigning value of number1 to number 2");
		number2= number1;
		System.out.println("Modified Value of number2: " + number2);
		System.out.println("Adding value of number1 to number 2");
		number2+=number1;
		System.out.println("Modified Value of number2: " + number2);
		System.out.println("Substracting value of number1 to number 2");
		number2-=number1;
		System.out.println("Modified Value of number2: " + number2);
		System.out.println("Multiplying value of number1 to number 2");
		number2*=number1;
		System.out.println("Modified Value of number2: " + number2);
		System.out.println("Dividing value of number1 to number 2");
		number2/=number1;
		System.out.println("Modified Value of number2: " + number2);
		System.out.println("Modulus of number 2 to number1");
		number2%=number1;
		System.out.println("Modified Value of number2: " + number2);
		
		
		
		
	}

}
