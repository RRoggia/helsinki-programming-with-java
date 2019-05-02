package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise64Test;

public class SolutionExercise64Test {

	@Test
	public void averageArrayNumbers() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		Exercise64Test.testImplementationOfAverage(SolutionExercise64.class, 3.5, numbers);
	}

}
