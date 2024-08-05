package com.aurionpro.module;
import java.util.Scanner;

public class Sumofnumbers {
	public static void main(String[] args) {
		System.out.println("Enter number1");
		Scanner sc = new Scanner(System.in);
		int number1= sc.nextInt();
		System.out.println("Enter number2");
		Scanner sc1 = new Scanner(System.in);
		int number2= sc1.nextInt();
		
		int add= number1+number2;
		
		System.out.println("The addition of two numbers are: " + add);
	}

}
