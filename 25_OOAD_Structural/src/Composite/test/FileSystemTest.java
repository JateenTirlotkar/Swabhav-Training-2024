package Composite.test;

import Composite.model.Directory;
import Composite.model.File;
import Composite.model.IFileSystem;

public class FileSystemTest {
	public static void main(String[] args) {
		IFileSystem file1 = new File("File 1");
		file1.showDetails();
		IFileSystem file2 = new File("File 2");
		file2.showDetails();
		IFileSystem file3 = new File("File 3");
		file3.showDetails();
		
		Directory directory1 = new Directory("Directory 1");
		System.out.println();
		directory1.add(file1);
		directory1.add(file2);
		directory1.showDetails();
		
	}

}
