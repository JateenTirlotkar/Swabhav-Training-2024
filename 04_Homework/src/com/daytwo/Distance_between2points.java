package com.daytwo;

import java.util.Scanner;

public class Distance_between2points {
	public static void main(String[] args) {
		System.out.println(
				"This program is to calculate Distance between two points, you have to just provide the x and y co-ordinates.");
		System.out.println("Enter x1 co-ordinate");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		System.out.println("Enter y1 co-ordinate");
		Scanner sc1 = new Scanner(System.in);
		int y1 = sc1.nextInt();
		System.out.println("Enter x2 co-ordinate");
		Scanner sc2 = new Scanner(System.in);
		int x2 = sc2.nextInt();
		System.out.println("Enter y2 co-ordinate");
		Scanner sc3 = new Scanner(System.in);
		int y2 = sc3.nextInt();

		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("The distance between the points is: " + distance);

	}

}
