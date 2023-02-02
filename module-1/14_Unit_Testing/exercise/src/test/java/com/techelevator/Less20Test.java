package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Less20Test {
	
	Less20 testMethods = new Less20();

	@Test
	public void test_for_18() {
		assertEquals("Incorrect Boolean returned from isLessThanMultipleOf20", true, testMethods.isLessThanMultipleOf20(18));
	}
	
	@Test
	public void test_for_19() {
		assertEquals("Incorrect Boolean returned from isLessThanMultipleOf20", true, testMethods.isLessThanMultipleOf20(18));
	}
	
	@Test
	public void test_for_20() {
		assertEquals("Incorrect Boolean returned from isLessThanMultipleOf20", false, testMethods.isLessThanMultipleOf20(20));
	}
	
	@Test
	public void test_for_40() {
		assertEquals("Incorrect Boolean returned from isLessThanMultipleOf20", false, testMethods.isLessThanMultipleOf20(40));
	}
	
	@Test
	public void test_for_38() {
		assertEquals("Incorrect Boolean returned from isLessThanMultipleOf20", true, testMethods.isLessThanMultipleOf20(38));
	}
	
	@Test
	public void test_for_39() {
		assertEquals("Incorrect Boolean returned from isLessThanMultipleOf20", true, testMethods.isLessThanMultipleOf20(39));
	}

}
