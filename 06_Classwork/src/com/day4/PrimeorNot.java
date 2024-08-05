package com.day4;
import java.util.Scanner;

public class PrimeorNot {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int j=0;
		
		
		int i = 2;
		while(i<number) {
			if(number%i==0) {
				j= j+i;
				
			}
			
			i++;
		}
		if(j==0) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}}


