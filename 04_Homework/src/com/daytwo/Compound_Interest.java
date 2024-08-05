package com.daytwo;
import java.util.Scanner;

public class Compound_Interest {
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
		
		System.out.println("Enter the number of times the interest will be compounded per year");
		Scanner sc3 = new Scanner(System.in);
		double compounding = sc3.nextDouble();
		
		double compoundInterest= (principal_amount*(1+ Math.pow(((rate_of_interest/100)/compounding), (loan_years * compounding))));

		System.out.println(compoundInterest);
	}



}
