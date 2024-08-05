package com.dayfive;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();

		int[] array = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Enter the number to search for: ");
		int target = scanner.nextInt();

		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (array[i] == target) {
				found = true;
				
			}
		}

		// Display the result
		if (found) {
			System.out.println("The number " + target + " exists in the array.");
		} else {
			System.out.println("The number " + target + " does not exist in the array.");
		}
	}
}
