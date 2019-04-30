package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

public class SolutionExercise65 {

	public static ArrayList<Integer> lenghts(ArrayList<String> words) {
		ArrayList<Integer> lengths = new ArrayList<>();

		for (String word : words) {
			lengths.add(word.length());
		}

		return lengths;

	}

}
