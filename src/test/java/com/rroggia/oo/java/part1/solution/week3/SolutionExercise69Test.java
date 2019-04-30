package com.rroggia.oo.java.part1.solution.week3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionExercise69Test {

	@Test
	public void wordIsPalindrome() {
		assertTrue(SolutionExercise69.palindrome("madam"));
	}

	@Test
	public void wordIsNotPalindrome() {
		assertFalse(SolutionExercise69.palindrome("example"));
	}

}
