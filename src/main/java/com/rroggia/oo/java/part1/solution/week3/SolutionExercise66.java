package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

public class SolutionExercise66 {

	public static int greatest(ArrayList<Integer> numbers) {
		Integer greatest = Integer.MIN_VALUE;

		for (Integer current : numbers) {
			if (current > greatest)
				greatest = current;
		}
		return greatest;
	}

}
