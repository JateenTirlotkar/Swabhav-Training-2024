package com.day4;
import java.util.Scanner;
public class Perfect_number {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum=0;
		int rem=0;
		
		int i=1;
		
		while (i<number) {
			if(number%i==0) {
				sum=sum+i;
				
			}
			i++;
			
		}
		if(sum==number) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("not perfect");
		}
		
		
		
		
		
		
	}

}
