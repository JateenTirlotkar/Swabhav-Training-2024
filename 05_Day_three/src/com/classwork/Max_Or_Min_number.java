package com.classwork;
import java.util.Scanner;

public class Max_Or_Min_number {
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2= sc.nextInt();
		
		if(number1>number2) {
			System.out.println("Number " + number1 +" is maximum");
			System.out.println("Number "+ number2 + " is minimum");
		}
		else {
			System.out.println("Number " + number1 +" is minimum");
			System.out.println("Number " + number2 +" is maximum");
		}
	}

}
