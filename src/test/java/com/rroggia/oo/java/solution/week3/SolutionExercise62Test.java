package com.rroggia.oo.java.solution.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Test;

public class SolutionExercise62Test {

	@Test
	public void removeLast() {
		ArrayList<String> brothers = new ArrayList<String>();
		brothers.add("Dick");
		brothers.add("Henry");
		brothers.add("Michael");
		brothers.add("Bob");

		int sizeBeforeRemoveLast = brothers.size() - 1;

		SolutionExercise62.removeLast(brothers);

		assertEquals(brothers.size(), sizeBeforeRemoveLast);

		assertFalse(brothers.contains("Bob"));

	}

}
