package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise63Test;

public class SolutionExercise63Test {

	@Test
	public void sumArrayNumbers() {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		Exercise63Test.testImplementationOfSum(SolutionExercise63.class, 14, numbers);
	}

}
