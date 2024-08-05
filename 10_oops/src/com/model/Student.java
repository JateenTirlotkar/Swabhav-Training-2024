package com.model;

import java.util.*;

public class Student {
	int roll_n;
	String name;
	int age;
	int percentage;

	public Student() {

	}

	public Student(int roll_n, String name, int age, int percentage) {
		this.roll_n = roll_n;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}

	public void setRoll() {
		System.out.println("Enter your roll no: ");
		Scanner sc = new Scanner(System.in);
		this.roll_n = sc.nextInt();

	}

	public int getRoll() {
		System.out.println("Roll no is: " + roll_n);
		return this.roll_n;
	}

	public void setName() {
		System.out.println("Enter your Name: ");
		Scanner sc1 = new Scanner(System.in);
		this.name = sc1.next();
	}

	public String getName() {
		System.out.println("Name is: " + name);
		return this.name;
	}

	public void setAge() {
		System.out.println("Enter your age: ");
		Scanner sc2 = new Scanner(System.in);
		this.age = sc2.nextInt();
	}

	public int getAge() {
		System.out.println("Age is: " + age);
		return this.age;
	}

	public void setPercentage() {
		System.out.println("Enter your Percentage: ");
		Scanner sc3 = new Scanner(System.in);
		this.percentage = sc3.nextInt();
	}

	public int getPercentage() {
		System.out.println("Your Percentage is: " + percentage);
		return this.percentage;
	}

	public int grade() {
		if (percentage > 75) {
			System.out.println("A Grade");
		} else if (percentage > 60 && percentage <= 75) {
			System.out.println(" B Grade");
		} else if (percentage > 50 && percentage <= 60) {
			System.out.println("C Grade");
		} else if (percentage > 40 && percentage <= 50) {
			System.out.println("D Grade");
		} else {
			System.out.println("Fail");
		}

		return this.percentage;
	}

}
