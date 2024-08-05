package Decorator.model;

public class WheelAlign extends ICarDecorator{

	public WheelAlign(OilChange oilChange) {
		super(oilChange);
		// TODO Auto-generated constructor stub
	}
	
	public Double getCost() {
		return 150 + super.getcost();
	}

}
