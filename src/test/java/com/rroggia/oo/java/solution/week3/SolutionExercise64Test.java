package com.rroggia.oo.java.solution.week3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class SolutionExercise64Test {

	@Test
	public void averageArrayNumbers() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		assertEquals(3.5, SolutionExercise64.average(numbers), 1.0);
	}

}
