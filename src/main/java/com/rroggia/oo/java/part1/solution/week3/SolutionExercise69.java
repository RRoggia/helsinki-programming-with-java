package com.rroggia.oo.java.part1.solution.week3;

public class SolutionExercise69 {

	public static boolean palindrome(String text) {
		return text.equals(SolutionExercise56.reverse(text));
	}

}
