package com.rroggia.oo.java.part1.solution.week3;

public class SolutionExercise56 {
	public static String reverse(String text) {
		String reversed = "";

		for (int i = text.length() - 1; i >= 0; i--) {
			reversed += text.charAt(i);
		}
		return reversed;
	}

}
