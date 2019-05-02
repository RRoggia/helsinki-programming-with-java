package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise68Test;

public class SolutionExercise68Test {

	private static final ArrayList<Integer> numbers = new ArrayList<Integer>();

	static {
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);
	}

	@Test
	public void containsNumberTwice() {
		Exercise68Test.testImplementationOfMoreThanOnce(SolutionExercise68.class, true, numbers, 2);
	}

	@Test
	public void containsNumberOnce() {
		Exercise68Test.testImplementationOfMoreThanOnce(SolutionExercise68.class, false, numbers, 3);
	}

}
