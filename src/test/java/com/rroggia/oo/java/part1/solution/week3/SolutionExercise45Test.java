package com.rroggia.oo.java.part1.solution.week3;

import org.junit.Test;

import com.rroggia.oo.java.part1.week3.Exercise45Test;

public class SolutionExercise45Test {

	@Test
	public void firstParameterIsGreatest() {
		Exercise45Test.testImplementationOfGreatestMethod(SolutionExercise45.class, 10, 10, 3, 2);
	}

	@Test
	public void secondParameterIsGreatest() {
		Exercise45Test.testImplementationOfGreatestMethod(SolutionExercise45.class, 11, -5, 11, 0);
	}

	@Test
	public void thirdParameterIsGreatest() {
		Exercise45Test.testImplementationOfGreatestMethod(SolutionExercise45.class, 5, 3, 3, 5);
	}

	@Test
	public void parametersAreEqual() {
		Exercise45Test.testImplementationOfGreatestMethod(SolutionExercise45.class, 4, 4, 4, 4);
	}

}
