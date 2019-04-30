package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

public class SolutionExercise64 {

	public static double average(ArrayList<Integer> list) {
		double size = list.size();
		return SolutionExercise63.sum(list) / size;
	}

}
