package com.rroggia.oo.java.part1.solution.week3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rroggia.oo.java.part1.solution.week3.SolutionExercise45;

public class SolutionExercise45Test {

	@Test
	public void firstParameterIsGreatest() {
		assertEquals(10, SolutionExercise45.greatest(10, 3, 2));
	}

	@Test
	public void secondParameterIsGreatest() {
		assertEquals(11, SolutionExercise45.greatest(-5, 11, 0));
	}

	@Test
	public void thirdParameterIsGreatest() {
		assertEquals(5, SolutionExercise45.greatest(3, 3, 5));
	}

	@Test
	public void parametersAreEqual() {
		assertEquals(4, SolutionExercise45.greatest(4, 4, 4));
	}

}
