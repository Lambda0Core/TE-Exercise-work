package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class NonStartTest {
	
	NonStart testMethods = new NonStart();

	@Test
	public void test_for_Hello_There() {
		assertEquals("Incorrect String returned from getPartialString", "ellohere", testMethods.getPartialString("Hello", "There"));
	}
	
	@Test
	public void test_for_java_code() {
		assertEquals("Incorrect String returned from getPartialString", "avaode", testMethods.getPartialString("java", "code"));
	}
	
	@Test
	public void test_for_shotl_java() {
		assertEquals("Incorrect String returned from getPartialString", "hotlava", testMethods.getPartialString("shotl", "java"));
	}
	
	@Test
	public void test_for_blankString() {
		assertEquals("Incorrect String returned from getPartialString", "", testMethods.getPartialString(" ", " "));
	}

}
