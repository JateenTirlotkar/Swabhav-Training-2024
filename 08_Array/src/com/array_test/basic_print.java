package com.array_test;

import java.util.Scanner;

public class basic_print {
	public static void main(String[] args) {
		System.out.println("Enter size of Array ");

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int array[] = new int[size];
		for (int i = 0; i < size; i++) {

			System.out.println("Enter Array Elements");
			array[i] = sc.nextInt();

		}
		System.out.println("Array is:");

		for (int i = 0; i < size; i++) {
			System.out.println(array[i] + "\t");
		}

	}

}
