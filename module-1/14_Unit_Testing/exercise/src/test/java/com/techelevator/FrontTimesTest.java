package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrontTimesTest {
	
	FrontTimes testMethods = new FrontTimes();

	@Test
	public void test_for_Chocolate_2() {
		assertEquals("Incorrect String returned from generateString", "ChoCho", testMethods.generateString("Chocolate", 2));
	}
	
	@Test
	public void test_for_Chocolate_3() {
		assertEquals("Incorrect String returned from generateString", "ChoChoCho", testMethods.generateString("Chocolate", 3));
	}
	
	@Test
	public void test_for_Abc_3() {
		assertEquals("Incorrect String returned from generateString", "AbcAbcAbc", testMethods.generateString("Abc", 3));
	}
	
	@Test
	public void test_for_Abc_0() {
		assertEquals("Incorrect String returned from generateString", "", testMethods.generateString("Abc", 0));
	}
	
	@Test
	public void test_for_null_1() {
		assertEquals("Incorrect String returned from generateString", "", testMethods.generateString(null, 1));
	}

}
