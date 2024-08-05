package solution.model;

public class FileLogger implements ILogger{

	@Override
	public void log(String err) {
		System.out.println("Logged to FileSystem "+ err);
		// TODO Auto-generated method stub
		
	}

}
