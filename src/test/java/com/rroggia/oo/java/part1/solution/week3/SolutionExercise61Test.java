package com.rroggia.oo.java.part1.solution.week3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.solution.week3.SolutionExercise61;

public class SolutionExercise61Test {

	@Test
	public void countItems() {
		ArrayList<String> names = new ArrayList<>();
		names.add("Ciao");
		names.add("Hallo");
		names.add("Hello");
		names.add("Ola");

		assertEquals(4, SolutionExercise61.countItems(names));

	}

}
