package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringBitsTest {
	
	StringBits testMethods = new StringBits();

	@Test
	public void test_for_Hello() {
		String expectedResult = "Hlo";
		String testData = "Hello";
		String actualResult = testMethods.getBits(testData);
		assertEquals("Incorrect String returned from getBits", expectedResult, actualResult);
	}
	
	@Test
	public void test_for_Heeololeo() {
		assertEquals("Incorrect String returned from getBits", "Hello", testMethods.getBits("Heeololeo"));
	}
	
	@Test
	public void test_for_null() {
		assertEquals("Incorrect String returned from getBits", "", testMethods.getBits(null));
	}
	
	@Test
	public void test_for_single_char() {
		assertEquals("Incorrect String returned from getBits", "a", testMethods.getBits("a"));
	}

}
