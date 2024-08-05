package com.list.test;

import java.util.ArrayList;
import java.util.*;

import com.list.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of list ");
		int input = scanner.nextInt();
		System.out.println("Enter number for index ");
		for(int i=0;i<input;i++)
		{
			
		}
		
		
		students.add(new Student(2,"shailesh",90.2));
		students.add(new Student(78,"Ram",89));
		students.add(new Student(8,"John",87));
		
		System.out.println("Normal for loops");
		for(int i=0;i<students.size();i++)
		{
			System.out.println(students.get(i));
		}
		System.out.println("Advance for loops");
		for(Student student:students)
		{
			System.out.println(students);
		}
		System.out.println("Using List Iterator");
		Iterator<Student> studentInterator = students.iterator();
		while(studentInterator.hasNext())
		{
			System.out.println(studentInterator.next());
		}
		System.out.println("Using ListIterator");
		
		ListIterator<Student> studentListIterator = students.listIterator();
				while(studentListIterator.hasNext()) {
					System.out.println(studentListIterator.next());
				}
				while(studentListIterator.hasPrevious()) {
					System.out.println(studentListIterator.previous());
				}
				
				
				
	
	}

}
