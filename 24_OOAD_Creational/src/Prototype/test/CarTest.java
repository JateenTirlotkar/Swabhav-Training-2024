package Prototype.test;

import Prototype.model.Car;

public class CarTest {
	public static void main(String[] args)  {
        Car originalCar = new Car("Ford Mustang", "Red", 2020);

        Car clonedCar1 = originalCar.clone();
        clonedCar1.setColor("Blue");
        clonedCar1.setYear(2021);
        
        Car clonedCar2 = originalCar.clone();
        

        System.out.println("Original Car: " + originalCar);
        System.out.println("Cloned Car1: " + clonedCar1);
        System.out.println("Cloned Car2 "+ clonedCar2);
    }

}
