package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

public class SolutionExercise67 {

	public static double variance(ArrayList<Integer> list) {
		double average = SolutionExercise64.average(list);
		double variance = 0;
		for (Integer number : list) {
			variance += (number - average) * (number - average);
		}
		return variance / (list.size() - 1);

	}

}
