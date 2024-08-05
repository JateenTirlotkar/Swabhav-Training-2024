package com.model;

public class Triangle extends Shape {
	private int height;
	private int base;

	public Triangle(int height, int base) {
		super();
		this.height = height;
		this.base = base;
	}

	@Override
	public void area() {
		System.out.println("Area of triangle is " + 0.5*(height*base));
		// TODO Auto-generated method stub
		
	}

}
