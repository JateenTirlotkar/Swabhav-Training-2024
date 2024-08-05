package AbstractFactory.model;

public class TataFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		ICar car = new Tata();
		return car;
	}

}
