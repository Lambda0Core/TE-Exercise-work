package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CigarPartyTest {
	
	CigarParty testMethods = new CigarParty();

	@Test
	public void test_for_30_false() {
		assertEquals("Incorrect Boolean returned from haveParty", false, testMethods.haveParty(30, false));
		
	}
	
	@Test
	public void test_for_50_false() {
		assertEquals("Incorrect Boolean returned from haveParty", true, testMethods.haveParty(50, false));
		
	}
	
	@Test
	public void test_for_70_true() {
		assertEquals("Incorrect Boolean returned from haveParty", true, testMethods.haveParty(70, true));
		
	}
	
	@Test
	public void test_for_70_false() {
		assertEquals("Incorrect Boolean returned from haveParty", false, testMethods.haveParty(70, false));
		
	}
	
	@Test
	public void test_for_0_false() {
		assertEquals("Incorrect Boolean returned from haveParty", false, testMethods.haveParty(0, false));
		
	}
	
	@Test
	public void test_for_0_true() {
		assertEquals("Incorrect Boolean returned from haveParty", false, testMethods.haveParty(0, true));
		
	}
	
	

}
