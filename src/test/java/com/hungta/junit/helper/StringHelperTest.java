package com.hungta.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	// AACD => CD ACD => CD CDEF=> CDEF CDAA=> CDAA
	StringHelper stringHelper;
	
	@Before
	public void before() {
		stringHelper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Position() {
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
	}

	// ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
}
