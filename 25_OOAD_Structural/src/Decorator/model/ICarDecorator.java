package Decorator.model;

public class ICarDecorator implements ICarService {
	ICarService car;
	
	public ICarDecorator(ICarService car) {
		super();
		this.car = car;
	}

	public Double getcost() {
		return car.getcost();
	}
	
	







}
