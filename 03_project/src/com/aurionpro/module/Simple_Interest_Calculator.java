package com.aurionpro.module;

import java.util.Scanner;

public class Simple_Interest_Calculator {
	public static void main(String[] args) {
		System.out.println("Enter the principal amount of the loan: ");
		Scanner sc = new Scanner(System.in);
		double principal_amount= sc.nextDouble();
		
		System.out.println("Enter the rate of Interest of the loan: ");
		Scanner sc1 = new Scanner(System.in);
		double rate_of_interest= sc1.nextDouble();
		
		System.out.println("Enter the number of years of the loan: ");
		Scanner sc2 = new Scanner(System.in);
		double loan_years= sc2.nextDouble();
		
		double simple_interest= (principal_amount* rate_of_interest * loan_years)/100;
		
		System.out.println("The Simple Interest on your loan is: " + simple_interest);
		
//		System.out.println("Enter the \n" + "Hii");
	}

}
