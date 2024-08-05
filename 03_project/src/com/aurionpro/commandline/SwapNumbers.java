package com.aurionpro.commandline;

public class SwapNumbers {
	public static void main(String[] args) {
		int number1= Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		System.out.println("Value before swapping "+ " "+ number1  + number2);

		
		int number3= number1;
		number1=number2;
		number2=number3;
		 System.out.println("Value after swaping: " + number1 + " " + number2);

		
	}

}
