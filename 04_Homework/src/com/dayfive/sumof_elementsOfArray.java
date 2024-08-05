package com.dayfive;

import java.util.Scanner;

public class sumof_elementsOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();

		int array[] = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + array[i];
		}

		
		System.out.println("The sum of the elements in the array is: " + sum);
	}
}
