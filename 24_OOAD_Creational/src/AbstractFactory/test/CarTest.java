package AbstractFactory.test;

import AbstractFactory.model.ICar;
import AbstractFactory.model.ICarFactory;
import AbstractFactory.model.Maruti;
import AbstractFactory.model.MarutiFactory;

public class CarTest {
	public static void main(String[] args) {
		ICarFactory car1 = new MarutiFactory();
		ICar car = car1.makeCar();
		
		ICar car2 = new Maruti();
		car2.start();
		car2.stop();
		
		
	}

}
