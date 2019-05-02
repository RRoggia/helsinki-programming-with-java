package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise61Test;

public class SolutionExercise61Test {

	@Test
	public void countItems() {
		ArrayList<String> names = new ArrayList<>();
		names.add("Ciao");
		names.add("Hallo");
		names.add("Hello");
		names.add("Ola");

		Exercise61Test.testImplementationOfCountItems(SolutionExercise61.class, 4, names);

	}

}
