package com.rroggia.oo.java.part1.solution.week3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class SolutionExercise67Test {

	@Test
	public void variance() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		assertEquals(5.666667, SolutionExercise67.variance(numbers), 0.01);

	}

}
