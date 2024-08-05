package factory.test;

import factory.model.CarCompany;
import factory.model.CarFactory;
import factory.model.ICar;
import factory.model.Mahindra;
import factory.model.Maruti;
import factory.model.Tata;

public class CarTest {
	public static void main(String[] args) {
		CarFactory car1 = new CarFactory();
		ICar car = car1.makeCar(CarCompany.Mahindra);
		car.start();
		car.stop();
			
		
		
		
		
	}

}
