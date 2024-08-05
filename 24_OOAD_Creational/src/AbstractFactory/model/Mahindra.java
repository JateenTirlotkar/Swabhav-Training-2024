package AbstractFactory.model;

public class Mahindra implements ICar{

	@Override
	public void start() {
		System.out.println("Maindra Car Started");
		
	}

	@Override
	public void stop() {
		System.out.println("Mahindra car stopped");
		
	}

}
