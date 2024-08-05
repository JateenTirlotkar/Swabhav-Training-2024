package solution.model;

public class DBLogger implements ILogger {

	@Override
	public void log(String err) {
		System.out.println("Logged to Database "+ err);
		// TODO Auto-generated method stub
		
	}

}
