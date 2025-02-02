package com.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	Operations operation;
	@BeforeEach
	void init() {
	operation = new Operations();
	}
	@AfterEach
	void status() {
		System.out.println("Test Finished");
	}

	@Test
	void testAddition() {
		
		assertEquals(30,operation.addition(10, 20),"This method must perform addition" );
		
	}
	@Test
	void testSubstraction() {
		
		assertEquals(30,operation.addition(10, 20) );
		
	}
	@Test
	void testMultiplication() {
		
		assertEquals(30,operation.addition(10, 20) );
		
	}
	@Test
	void testDivision() {
		
		assertEquals(30,operation.addition(10, 20) );
		
	}
	@Test
	void testSquareOfArrayElements() {
		int square[]= {25,36,49};
		int numbers[]= {5,6,7};
		assertArrayEquals(square, operation.squareOfArrayElements(numbers));
		
	}
	@Test
	void testIsEven() {
		assertEquals(true, operation.isEven(6));
		assertTrue(operation.isEven(6));
		assertFalse(operation.isEven(5));
	}
	

}
