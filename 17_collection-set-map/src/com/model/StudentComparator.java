package com.model;
import java.util.Comparator;

public class StudentComparator {
	public static class NameComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {
			
			return student1.getName().compareTo(student2.getName());
		}
		

	}
	
	public static class RollNumberComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {
			if(student1.getRollNumber()>student2.getRollNumber())
				return 1;
			if(student1.getRollNumber()<student2.getRollNumber())
				return -1;
			return 0;
		}
		

	}
	

}
