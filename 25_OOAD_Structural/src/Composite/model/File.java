package Composite.model;

public class File implements  IFileSystem{
	private String name;

	public File(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showDetails() {
		System.out.println("File: "+ name);
		
		// TODO Auto-generated method stub
		
	}

}
