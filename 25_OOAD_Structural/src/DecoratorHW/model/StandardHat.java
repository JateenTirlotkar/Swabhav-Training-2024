package DecoratorHW.model;

public class StandardHat  implements IHat{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Standard Hat";
	}

	@Override
	public String toString() {
		return "StandardHat [getName()=" + getName() + ", getPrice()=" + getPrice() + ", getDescription()="
				+ getDescription() + "]";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "It a basic Standard Hat";
	}

}
