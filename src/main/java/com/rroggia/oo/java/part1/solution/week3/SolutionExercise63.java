package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

public class SolutionExercise63 {

	public static int sum(ArrayList<Integer> list) {
		Integer sum = 0;
		for (Integer number : list) {
			sum += number;
		}

		return sum;
	}

}
