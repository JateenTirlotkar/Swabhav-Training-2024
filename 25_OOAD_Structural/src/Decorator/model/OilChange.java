package Decorator.model;

public class OilChange  extends ICarDecorator{

	public OilChange(ICarService car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public Double getCost() {
		return (500.0 + car.getcost());
	}

}
