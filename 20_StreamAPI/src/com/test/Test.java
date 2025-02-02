package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(25, 45, 35, 20, 30);

		// Stream<Integer>numberStream=numbers.stream();
//		numbers.stream().forEach((number) -> System.out.println(number));
//
//		List<Integer> filteredNumbers = numbers.stream().filter((number) -> (number % 2 != 0))
//				.filter((number) -> (number > 35)).collect((Collectors.toList()));
//		// .forEach((number)->System.out.println(number)));
//
//		System.out.println(filteredNumbers);

		List<Integer> squareNumbers = numbers.stream().map((number) -> number * number).collect(Collectors.toList());
		System.out.println(squareNumbers);
		
		
		int sum = numbers.stream().reduce(0, (number1,number2)->number1+number2);
		System.out.println("Sum "+ sum);
		System.out.println("Ascending order");
		numbers.stream().sorted().forEach((number)->System.out.println(number));
		System.out.println("Decending order");
		
		numbers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach((number)->System.out.println(number));
		
		Optional<Integer> max=numbers.stream().max((number1,number2)->number1-number2);
		if(max.isPresent())
			System.out.println("Max is "+max.get());
		System.out.println();
		
		Optional<Integer> min = numbers.stream().min((number1,number2)->number1-number2);
		if(min.isPresent())
			System.out.println("Min is "+ min.get());
	}

}
