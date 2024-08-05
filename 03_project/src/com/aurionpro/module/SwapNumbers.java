package com.aurionpro.module;

import java.util.Scanner;


public class SwapNumbers {
	public static void main(String[] args) {
		
	System.out.println("Enter number1");
	Scanner sc = new Scanner(System.in);
	int number1= sc.nextInt();
	System.out.println("Enter number2");
	Scanner sc1 = new Scanner(System.in);
	int number2= sc1.nextInt();
	
	System.out.println("Value before swapping "+ " "+ number1  + number2);
	
	int number3=number1;
	 number1=number2;
	 number2=number3;
	 
	 System.out.println("Value after swaping: " + number1 + " " + number2);

}
}
