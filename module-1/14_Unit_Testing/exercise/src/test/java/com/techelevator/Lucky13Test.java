package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lucky13Test {
	
	Lucky13 testMethods = new Lucky13();

	@Test
	public void test_for_024() {
		int[] nums = {0, 2, 4};
		assertEquals("Incorrect Boolean returned from getLuck", true, testMethods.getLucky(nums));
	}
	
	@Test
	public void test_for_123() {
		int[] nums = {1, 2, 3};
		assertEquals("Incorrect Boolean returned from getLuck", false, testMethods.getLucky(nums));
	}
	
	@Test
	public void test_for_124() {
		int[] nums = {1, 2, 4};
		assertEquals("Incorrect Boolean returned from getLuck", false, testMethods.getLucky(nums));
	}
	
	@Test
	public void test_for_111() {
		int[] nums = {1, 1, 1};
		assertEquals("Incorrect Boolean returned from getLuck", false, testMethods.getLucky(nums));
	}
	
	@Test
	public void test_for_222() {
		int[] nums = {2, 2, 2};
		assertEquals("Incorrect Boolean returned from getLuck", true, testMethods.getLucky(nums));
	}
	
	@Test
	public void test_for_333() {
		int[] nums = {3, 3, 3};
		assertEquals("Incorrect Boolean returned from getLuck", false, testMethods.getLucky(nums));
	}
	
	@Test
	public void test_for_000() {
		int[] nums = {0, 0, 0};
		assertEquals("Incorrect Boolean returned from getLuck", true, testMethods.getLucky(nums));
	}

}
