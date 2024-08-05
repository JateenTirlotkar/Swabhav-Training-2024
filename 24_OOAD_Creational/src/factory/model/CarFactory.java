package factory.model;

public class CarFactory {
	public ICar makeCar(CarCompany carName) {
		ICar car = null;
		if(carName == CarCompany.Maruti)
			car = new Maruti();
		if(carName == CarCompany.Tata)
			car = new Tata();
		if(carName== CarCompany.Mahindra)
			car = new Mahindra();
		return car;
		
	}

}
