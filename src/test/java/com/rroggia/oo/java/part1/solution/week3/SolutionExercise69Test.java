package com.rroggia.oo.java.part1.solution.week3;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise69Test;

public class SolutionExercise69Test {

	@Test
	public void wordIsPalindrome() {
		Exercise69Test.testImplementationOfPalindrome(SolutionExercise69.class, true, "madam");
	}

	@Test
	public void wordIsNotPalindrome() {
		Exercise69Test.testImplementationOfPalindrome(SolutionExercise69.class, false, "example");
	}

}
