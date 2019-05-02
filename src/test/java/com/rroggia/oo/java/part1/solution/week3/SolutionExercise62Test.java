package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise62Test;

public class SolutionExercise62Test {

	@Test
	public void removeLast() {
		ArrayList<String> brothers = new ArrayList<String>();
		brothers.add("Dick");
		brothers.add("Henry");
		brothers.add("Michael");
		brothers.add("Bob");

		int sizeBeforeRemoveLast = brothers.size() - 1;

		Exercise62Test.testImplementationOfRemoveLast(SolutionExercise62.class, sizeBeforeRemoveLast, brothers);

	}

}
