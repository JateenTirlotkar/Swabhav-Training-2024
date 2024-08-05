package com.day4;
import java.util.Scanner;

public class PrintsumOfNumbers {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i = 1;
		int z = 0;
		
		while(i<=number) {
			z= z+i;
			i++;
			
			
		}
		System.out.println(z);
	}

}
