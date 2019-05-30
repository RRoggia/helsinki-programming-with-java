package com.rroggia.oo.java.part1.solution.week1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rroggia.oo.java.ExerciseRunner;
import com.rroggia.oo.java.ExerciseTest;

public class SolutionExercise1Test extends ExerciseTest {

	@Test
	public void printedJaneDoe() {
		String result = new ExerciseRunner(getExerciseImplementationClass()).getOneLinePrintedInTheConsole();
		assertEquals("Jane Doe", result);

	}

	@Override
	protected Class<?> getExerciseImplementationClass() {
		return SolutionExercise1.class;
	}

}
