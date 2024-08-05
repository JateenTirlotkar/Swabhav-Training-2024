package com.aurionpro.commandline;

public class Swapper2 {
	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		System.out.println("Value before swapping "  + number1  + " "+ number2);
		number2 = number1 + number2;
		number1 = number2 - number1;
		number2 = number2 - number1;
		System.out.println("Value after swaping: " + number1 + " " + number2);
	}

}
