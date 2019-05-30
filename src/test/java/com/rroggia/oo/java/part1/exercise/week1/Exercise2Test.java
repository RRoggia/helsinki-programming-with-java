package com.rroggia.oo.java.part1.exercise.week1;

import com.rroggia.oo.java.part1.solution.week1.SolutionExercise2Test;

public class Exercise2Test extends SolutionExercise2Test {

	private static final String QUALIFIED_NAME_EXERCISE2 = "com.rroggia.oo.java.part1.week1.Exercise2";

	@Override
	protected Class<?> getExerciseImplementationClass() {
		try {
			return Class.forName(QUALIFIED_NAME_EXERCISE2);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Missing implementation class for " + this.getClass().getSimpleName()
					+ ". Expected class " + QUALIFIED_NAME_EXERCISE2);
		}
	}

}
