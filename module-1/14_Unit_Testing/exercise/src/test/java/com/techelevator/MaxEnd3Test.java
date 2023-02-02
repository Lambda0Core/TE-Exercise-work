package com.techelevator;

import org.junit.Test;

public class MaxEnd3Test {
	
	MaxEnd3 testMethods = new MaxEnd3();

	private void assertEqualsArray(String string, int[] correctArray, int[] makeArray) {
	
		
	}

	@Test
	public void test_for_123() {
		int[] correctArray = {3, 3, 3};
		int[] nums = {1, 2, 3};
		assertEqualsArray("Incorrect Array returned from makeArray", correctArray , testMethods.makeArray(nums));
	}
	
	@Test
	public void test_for_1159() {
		int[] correctArray = {11, 11, 11};
		int[] nums = {11, 5, 9};
		assertEqualsArray("Incorrect Array returned from makeArray", correctArray , testMethods.makeArray(nums));
	}
	
	

	@Test
	public void test_for_2113() {
		int[] correctArray = {11, 11, 11};
		int[] nums = {2, 11, 3};
		assertEqualsArray("Incorrect Array returned from makeArray", correctArray , testMethods.makeArray(nums));
	}
	
	@Test
	public void test_for_000() {
		int[] correctArray = {0, 0, 0};
		int[] nums = {0, 0, 0};
		assertEqualsArray("Incorrect Array returned from makeArray", correctArray , testMethods.makeArray(nums));
	}

}
