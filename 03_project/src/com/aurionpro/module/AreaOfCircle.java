package com.aurionpro.module;
import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		System.out.println("Enter the radius of the circle: ");
		Scanner sc = new Scanner(System.in);
		int radius= sc.nextInt();
		double area= 3.14 * radius * radius;
		
		System.out.println("The area of the circle is: " + area);
	}

}
//take principle amount 
//rate of interest 
//no of years from user