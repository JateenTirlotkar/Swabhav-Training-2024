package AbstractFactory.model;

public class MahindraFactory implements ICarFactory {

	@Override
	public ICar makeCar() {
		ICar car = new Mahindra();
		return car;
	}

}
