package Decorator.test;

import Decorator.model.CarInspection;
import Decorator.model.ICarDecorator;
import Decorator.model.ICarService;
import Decorator.model.OilChange;

public class CarTest {
	public static void main(String[] args) {
		ICarService car = new CarInspection();
//		ICarDecorator decorator = new ICarDecorator(car);
		OilChange oilChange = new OilChange(car);
		System.out.println(oilChange.getCost());
		
	}

}
