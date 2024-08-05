package com.daytwo;
import java.util.Scanner;

public class Bmi_Calculator {
	public static void main(String[] args) {
		System.out.println("Enter your weight in kg: ");
		Scanner sc = new Scanner(System.in);
		int weight= sc.nextInt();
		System.out.println("Enter your height in meters: ");
		Scanner sc1 = new Scanner(System.in);
		float height= sc1.nextFloat();
		float bmi = weight/(height*height);
		System.out.println("Your BMI is: " + bmi);
	}

}
