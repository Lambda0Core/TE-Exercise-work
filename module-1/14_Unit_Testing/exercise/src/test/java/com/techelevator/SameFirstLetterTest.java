package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SameFirstLetterTest {
	
	SameFirstLast testMethods = new SameFirstLast();

	@Test
	public void test_for_123() {
		int[] nums = {1, 2, 3};
		assertEquals("Incorrect Boolean returned from isTheSame", false, testMethods.isItTheSame(nums));
	}
	
	@Test
	public void test_for_1231() {
		int[] nums = {1, 2, 3, 1};
		assertEquals("Incorrect Boolean returned from isTheSame", true, testMethods.isItTheSame(nums));
	}
	
	@Test
	public void test_for_121() {
		int[] nums = {1, 2, 1};
		assertEquals("Incorrect Boolean returned from isTheSame", true, testMethods.isItTheSame(nums));
	}
	
	@Test
	public void test_for_100001() {
		int[] nums = {1, 0, 0, 0, 0, 1};
		assertEquals("Incorrect Boolean returned from isTheSame", true, testMethods.isItTheSame(nums));
	}
	
	@Test
	public void test_for_10000() {
		int[] nums = {1, 0, 0, 0, 0};
		assertEquals("Incorrect Boolean returned from isTheSame", false, testMethods.isItTheSame(nums));
	}
	
	

}
