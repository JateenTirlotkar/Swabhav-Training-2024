package com.day4;
import java.util.Scanner;

public class PrimeorNot_usingFor {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		int i=2;
		
		for(i=2;i<number;i++) {
			if(number%i==0) {
				sum=sum+i;
			}
		
			
		}
		if(sum==0) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
		
	}

}
