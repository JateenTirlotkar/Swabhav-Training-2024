package com.day4;
import java.util.Scanner;
public class Factorialofa_number {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i;
		int fact=1;
		for(i=1;i<=number;i++) {
			fact=fact*i;
			System.out.println("factoriles are: " + fact);
		}
		
	}

}
