package com.rroggia.oo.java.part1.solution.week3;

import org.junit.Test;

import com.rroggia.oo.java.part1.week3.Exercise44Test;

public class SolutionExercise44Test {

	@Test
	public void firstParameterIsTheLeast() {
		Exercise44Test.testImplementationOfLeastMethod(SolutionExercise44.class, 1, 1, 8);
	}

	@Test
	public void secondParameterIsTheLeast() {
		Exercise44Test.testImplementationOfLeastMethod(SolutionExercise44.class, 3, 8, 3);
	}

	@Test
	public void parametersAreEqual() {
		Exercise44Test.testImplementationOfLeastMethod(SolutionExercise44.class, 4, 4, 4);
	}

}
