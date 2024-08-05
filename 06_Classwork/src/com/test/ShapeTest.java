package com.test;

import com.model.Circle;
import com.model.Rectangle;
import com.model.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		
	
	Circle circle = new Circle(5);
	circle.area();
	
	Rectangle rectangle = new Rectangle(10, 2);
	rectangle.area();
	
	Triangle triangle = new Triangle(10, 2);
	triangle.area();
	
	}
	

}
