package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.week3.Exercise67Test;

public class SolutionExercise67Test {

	@Test
	public void variance() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		Exercise67Test.testImplementationOfVariance(SolutionExercise67.class, 5.666667, numbers);

	}

}
