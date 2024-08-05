package com.classwork;
import java.util.Scanner;


public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("The entered number " + number +" is even");
		}
		else {
			System.out.println("The entered number " + number +" is odd");
		}
	}

}
