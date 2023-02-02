package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateFashionTest {
	
	DateFashion testMethods = new DateFashion();
	@Test
	public void test_for_5_10() {
		assertEquals("Incorrect Integer returned from getATable", 2, testMethods.getATable(5,10));
	}
	
	@Test
	public void test_for_5_2() {
		assertEquals("Incorrect Integer returned from getATable", 0, testMethods.getATable(5,2));
	}
	
	@Test
	public void test_for_5_5() {
		assertEquals("Incorrect Integer returned from getATable", 1, testMethods.getATable(5,5));
	}
	
	@Test
	public void test_for_0_10() {
		assertEquals("Incorrect Integer returned from getATable", 0, testMethods.getATable(0,10));
	}

}
