package DecoratorHW.model;

public class PremiumHat implements IHat{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Premium Hat";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Its a quality Hat";
	}

}
