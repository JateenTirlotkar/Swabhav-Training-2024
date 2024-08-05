package com.aurionpro.test;

import com.aurionpro.module.CalculatorTest;

public class Calculator {
	public static void main(String[] args) {
		int a= 20;
		int b= 10;
		
		System.out.println("Addition of n1 & n2 is: "+ CalculatorTest.addition(a, b));
		System.out.println("Addition of n1 & n2 is: "+ CalculatorTest.substraction(a, b));
		System.out.println("Addition of n1 & n2 is: "+ CalculatorTest.multiplication(a, b));
		System.out.println("Addition of n1 & n2 is: "+ CalculatorTest.division(a, b));
		
	}

}
