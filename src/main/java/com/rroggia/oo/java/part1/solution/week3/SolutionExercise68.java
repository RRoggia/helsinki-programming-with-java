package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

public class SolutionExercise68 {

	public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
		boolean foundNumberOnce = false;
		for (Integer current : list) {
			boolean isEqual = number == current;

			if (isEqual && !foundNumberOnce)
				foundNumberOnce = true;
			else if (isEqual && foundNumberOnce)
				return true;
		}

		return false;
	}

}
