package com.rroggia.oo.java.solution.week3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

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
