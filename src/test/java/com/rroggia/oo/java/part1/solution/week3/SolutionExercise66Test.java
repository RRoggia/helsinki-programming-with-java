package com.rroggia.oo.java.part1.solution.week3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class SolutionExercise66Test {

	@Test
	public void greatest() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		assertEquals(7, SolutionExercise66.greatest(numbers));

	}

	@Test
	public void allTheSameNumber() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(3);
		numbers.add(3);
		numbers.add(3);

		assertEquals(3, SolutionExercise66.greatest(numbers));

	}

}
