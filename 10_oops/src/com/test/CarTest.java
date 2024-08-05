package com.test;

import com.model.Car;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car("Mahindra",15,1200000);
		car1.setCompanyName("Mahindra");
		car1.setMileage(15);
		car1.setPrice(1200000);
		
		System.out.println(car1.toString());
	}

}
