package com.rroggia.oo.java.part1.solution.week1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rroggia.oo.java.ExerciseRunner;
import com.rroggia.oo.java.ExerciseTest;

public class SolutionExercise5Test extends ExerciseTest {
	@Test
	public void printedSecondsInAYear() {
		String line = new ExerciseRunner(getExerciseImplementationClass()).getOneLinePrintedInTheConsole();
		assertEquals("There are 31536000 seconds in a year.", line);
	}

	@Override
	protected Class<?> determineImplementationClass() throws ClassNotFoundException {
		return SolutionExercise5.class;
	}

}
