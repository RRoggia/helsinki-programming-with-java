package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise66Test;

public class SolutionExercise66Test {

	@Test
	public void greatest() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		Exercise66Test.testImplementationOfGreatest(SolutionExercise66.class, 7, numbers);

	}

	@Test
	public void allTheSameNumber() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(3);
		numbers.add(3);
		numbers.add(3);

		Exercise66Test.testImplementationOfGreatest(SolutionExercise66.class, 3, numbers);

	}

}
