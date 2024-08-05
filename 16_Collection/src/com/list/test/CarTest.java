package com.list.test;
import java.util.*;

import com.list.model.Car;

public class CarTest {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<Car>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of cars ");
		int size  = scanner.nextInt();
		
		System.out.println("Enter Car details ");
		for (int i=0;i<size;i++)
		{
			System.out.println("Enter car Id ");
			int carId = scanner.nextInt();
			System.out.println("Enter car Company ");
			String companyName = scanner.next();
			System.out.println("Enter Car Price ");
			int price = scanner.nextInt();
			System.out.println("Enetr Car mileage");
			int mileage = scanner.nextInt();
			cars.add(new Car (carId,companyName,price,mileage));
		}
		
		for (Car car: cars)
		{
			System.out.println(car);
		}
		
		Car maxMileageCar = cars.get(0);
        for (Car car : cars) {
            if (car.getMileage() > maxMileageCar.getMileage()) {
                maxMileageCar = car;
            }
        }

        System.out.println("Car with the maximum mileage is: " + maxMileageCar);
        scanner.close();
		
		
		
	}
	
	

}
