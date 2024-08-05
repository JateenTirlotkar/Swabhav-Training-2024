package Composite.model;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystem{
	private String name;
	List<IFileSystem> fileSystems = new ArrayList<>();
	

	public Directory(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showDetails() {
		System.out.println("Directory "+ name);
		for(IFileSystem fileSystem: fileSystems) {
			fileSystem.showDetails();
		}
		// TODO Auto-generated method stub
		
	}
	
	public void add(IFileSystem fileSystem) {
		fileSystems.add(fileSystem);
		
	}
	
	

}
