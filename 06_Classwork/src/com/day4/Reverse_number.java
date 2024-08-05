package com.day4;
import java.util.Scanner;

public class Reverse_number {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		while(number>=1) {
			System.out.println(number + " ");
			number--;
		}
	}

}
