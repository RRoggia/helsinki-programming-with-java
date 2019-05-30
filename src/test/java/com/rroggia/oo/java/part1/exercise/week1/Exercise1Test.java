package com.rroggia.oo.java.part1.exercise.week1;

import com.rroggia.oo.java.part1.solution.week1.SolutionExercise1Test;

public class Exercise1Test extends SolutionExercise1Test {

	private static final String QUALIFIED_NAME_EXERCISE1 = "com.rroggia.oo.java.part1.week1.Exercise1";

	@Override
	protected Class<?> getExerciseImplementationClass() {
		try {
			return Class.forName(QUALIFIED_NAME_EXERCISE1);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Missing implementation class for " + this.getClass().getSimpleName()
					+ ". Expected class " + QUALIFIED_NAME_EXERCISE1);
		}
	}

}
