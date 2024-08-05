package com.day4;
import java.util.Scanner;

public class AddoEvenNumbers {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		int i=2;
		int z=0;
		while(i<=number) {
			if(i%2==0) {
				z=z+i;
				i++;
				
			}
			else {
				i++;
			}
			
			
		}
		System.out.println(z);
	}

}
