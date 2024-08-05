package DecoratorHW.model;

public class RibbonedHat extends HatDecorator {

	public RibbonedHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		// TODO Auto-generated method stub
		return "Ribboned Hat";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 200+hat.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "This adds ribbon to the hat";
	}

}
