package com.test;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		//user will give input and print square
		Consumer<Integer> consumer = (Integer number) -> System.out.println("Square of a number is : " + number*number);
		consumer.accept(5);
	}

}
