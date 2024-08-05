package com.classwork;
import java.util.Scanner;


public class CheckFor_PositiveOrNegativeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number>0) {
			System.out.println("The number is positive");
		}
		else if(number<0) {
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The entered number is 0");
		}
		
	}

	

}
