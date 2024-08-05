package com.day4;
import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int sum=0;
		int rem=0;
		
		while(number>0) {
			rem= number%10;
			sum=sum+rem;
			number=number/10;
		}
		System.out.println(sum);
		
	}

}
