package Decorator.model;

import DecoratorHW.model.HatDecorator;
import DecoratorHW.model.IHat;

public class GoldenHat  extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		// TODO Auto-generated method stub
		return "Golden Colored Hat";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 500+hat.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "It given golden color to hat";
	}

}
