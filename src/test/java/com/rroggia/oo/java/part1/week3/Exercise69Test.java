package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Exercise69Test {

	@Test
	public void wordIsPalindrome() {
		assertTrue(Exercise69.palindrome("madam"));
	}

	@Test
	public void wordIsNotPalindrome() {
		assertFalse(Exercise69.palindrome("example"));
	}
}
