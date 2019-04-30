package com.rroggia.oo.java.solution.week3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionExercise44Test {

	@Test
	public void firstParameterIsTheLeast() {
		assertEquals(1, SolutionExercise44.least(1, 8));
	}

	@Test
	public void secondParameterIsTheLeast() {
		assertEquals(3, SolutionExercise44.least(8, 3));
	}

	@Test
	public void parametersAreEqual() {
		assertEquals(4, SolutionExercise44.least(4, 4));
	}

}
