package com.model;

import java.util.Scanner;

public class Circle {
	public int radius;
	public double area;

	public Circle() {

	}

	public Circle(int radius) {
		this.radius = radius;

	}

	public void setRadius(int radius) {
		this.radius = radius;

	}

	public int getRadius() {
		System.out.println("Radius is: " + radius);
		return this.radius;
	}

	public void setArea() {
		this.area = (3.14) * radius * radius;

	}

	public double getArea(double area) {
		System.out.println("Area");
		return this.area;
	}

}
