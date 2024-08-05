package com.dayfour;

public class PrimePattern {
	public static void main(String[] args) {
		int max = 23;
		int count = 0;
		int currentRowCount = 1;
		int number = 2;

		while (number <= max) {
			if (isPrime(number)) {
				System.out.print(number + "\t");
				count++;
				if (count == currentRowCount) {
					System.out.println();
					currentRowCount++;
					count = 0;
				}
			}
			number++;
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
