package AbstractFactory.model;

public class Tata implements ICar {

	@Override
	public void start() {
		System.out.println("Tata car Started");
		
	}

	@Override
	public void stop() {
		System.out.println("Tata car Stopped");
		
	}

}
