package com.day4;



public class Print_tale {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;

		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				System.out.print((i * j + "\t"));
			}
			System.out.println(" ");
		}
	}

}
