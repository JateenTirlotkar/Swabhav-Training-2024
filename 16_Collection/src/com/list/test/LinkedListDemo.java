package com.list.test;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.addFirst(30);
		numbers.addLast(50);
		System.out.println(numbers);
	}

}
