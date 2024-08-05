package com.aurionpro.commandline;

public class AreaOfCircle {
	public static void main(String[] args) {

		int radius = Integer.parseInt(args[0]);

		double area = 3.14 * radius * radius;

		System.out.println("The area of the circle is: " + area);

	}

}
