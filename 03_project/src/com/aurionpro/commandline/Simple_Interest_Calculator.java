package com.aurionpro.commandline;

public class Simple_Interest_Calculator {
	public static void main(String[] args) {
		int principal_amount = Integer.parseInt(args[0]);
		float rate_of_interest = Float.parseFloat(args[1]);
		int loan_years = Integer.parseInt(args[2]);
		
		double simple_interest= (principal_amount* rate_of_interest * loan_years)/100;
		System.out.println("The Simple Interest on your loan is: " + simple_interest);
		

	}

}
