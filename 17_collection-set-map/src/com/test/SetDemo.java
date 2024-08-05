package com.test;
import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>();
		set1.add("Ollie");
		set1.add("Liver");
		set1.add("Barathein");
		
		System.out.println(set1);
		
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		set2.add("Ollie1");
		set2.add("Liver2");
		set2.add("Barathein3");
		
		System.out.println(set2);
		
		
		
		TreeSet<String> set3 = new TreeSet<>();
		set3.add("Ollie");
		set3.add("Liver");
		set3.add("Barathein");
		
		set3.addAll(set2);
		
		
		
		System.out.println(set3);
		
		set3.removeAll(set2);
		System.out.println(set3);
		
	}

}
