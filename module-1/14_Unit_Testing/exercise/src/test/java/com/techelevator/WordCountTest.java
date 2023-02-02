package com.techelevator;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCountTest {
	
	WordCount testMethods = new WordCount(); 

	@Test
	public void test_for_baba_blacksheep() {
		Map<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("ba", 2);
		expected.put("black", 1);
		expected.put("sheep", 1);
		String[] testData = {"ba", "ba", "black", "sheep"};
		assertEquals("Incorrect Array returned from getCount", expected, testMethods.getCount(testData));
	}
	
	@Test
	public void test_for_abacb() {
		Map<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("a", 2);
		expected.put("b", 2);
		expected.put("c", 1);
		String[] testData = {"a", "b", "a", "c", "b"};
		assertEquals("Incorrect Array returned from getCount", expected, testMethods.getCount(testData));
	}
	
	@Test
	public void test_for_() {
		Map<String, Integer> expected = new HashMap<String, Integer>();
		String[] testData = {};
		assertEquals("Incorrect Array returned from getCount", expected, testMethods.getCount(testData));
	}
	
	@Test
	public void test_for_cba() {
		Map<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("c", 1);
		expected.put("b", 1);
		expected.put("a", 1);
		String[] testData = {"c", "b", "a"};
		assertEquals("Incorrect Array returned from getCount", expected, testMethods.getCount(testData));
	}
	
	@Test
	public void test_for_aaaaaaaaaaaaaaaaaaaa() {
		Map<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("a", 20);
		String[] testData = {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"};
		assertEquals("Incorrect Array returned from getCount", expected, testMethods.getCount(testData));
	}

}
