package com.daytwo;

import java.util.Scanner;

public class Converting_minutes_to_hours {
	public static void main(String[] args) {
		System.out.println("Enter minutes");
		Scanner sc = new Scanner(System.in);
		int minutes = sc.nextInt();
		int hours=minutes/60;
		int remaining_Minutes=minutes%60;
		System.out.println("This " + minutes + " mins becomes: "+hours + " hours " + remaining_Minutes + " minutes");

	}

}
