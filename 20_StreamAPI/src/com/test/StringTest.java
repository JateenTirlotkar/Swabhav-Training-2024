package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StringTest {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Jayesh", "Nimesh", "Mark", "Mahesh", "Ramesh");
		strings.stream().limit(3).sorted().forEach((stream) -> System.out.println(stream));
		System.out.println();

		strings.stream().filter(string -> string.contains("a")).sorted().limit(3).forEach(System.out::println);
		System.out.println();
		
		strings.stream().sorted(Comparator.reverseOrder()).forEach((stream) -> System.out.println(stream));
		System.out.println();
		
		strings.stream().forEach((string)->System.out.println(string.substring(0, 3)));
		System.out.println();
		
		strings.stream().filter(string->string.length()<=4).forEach((stream) -> System.out.println(stream));
		
		

	}

}
