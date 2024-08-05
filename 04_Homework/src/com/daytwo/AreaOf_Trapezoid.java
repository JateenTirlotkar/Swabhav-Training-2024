package com.daytwo;
import java.util.Scanner;

public class AreaOf_Trapezoid {

	public static void main(String[] args) {
		System.out.println("Enter the length of Upper base of trapezoid in meters");
		Scanner sc = new Scanner(System.in);
		int upperBase= sc.nextInt();
		
		System.out.println("Enter the length of Lower base of trapezoid in meters");
		Scanner sc1 = new Scanner(System.in);
		int lowerBase= sc1.nextInt();
		
		System.out.println("Enter the length of Height of trapezoid in meters");
		Scanner sc2 = new Scanner(System.in);
		int height= sc2.nextInt();
		
		float areaOfTrapezoid= ((upperBase + lowerBase)/2) * height;
		
		System.out.println("The Area of the given Trapezoid is: " + areaOfTrapezoid);
		
	}
}
