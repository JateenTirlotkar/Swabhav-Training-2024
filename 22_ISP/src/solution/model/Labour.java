package solution.model;

public class Labour implements IWorkable, ILunchInterval {

	@Override
	public void eat() {
		System.out.println("Labour Started eating");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drink() {
		System.out.println("Labour Stared Drinking");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		System.out.println("Labour started working");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		System.out.println("Labour Stopped working");
		// TODO Auto-generated method stub
		
	}

}
