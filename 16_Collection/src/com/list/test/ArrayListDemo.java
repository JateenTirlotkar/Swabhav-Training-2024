package com.list.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		List<Integer> numbers = Arrays.asList(10,20,30,40);
		System.out.println(names.size());
		System.out.println(names);
		names.add("Subodh");
		names.add("Aditya");
		names.add("Sarthak");
		names.add("Deep");
		System.out.println(names);
		names.add(2,"Saurabh");
		System.out.println(names);
		names.add(5,"Parag");
		System.out.println(names);
		names.remove("Deep");
		System.out.println(names);
		
		System.out.println(names.hashCode());
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		System.out.println(names.spliterator());
		System.out.println(names);

	}

}
