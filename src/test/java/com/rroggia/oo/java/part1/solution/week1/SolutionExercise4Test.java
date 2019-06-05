package com.rroggia.oo.java.part1.solution.week1;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.rroggia.oo.java.ExerciseRunner;
import com.rroggia.oo.java.ExerciseTest;

public class SolutionExercise4Test extends ExerciseTest {

	@Test
	public void printedValuesCorrectly() {
		List<String> console = new ExerciseRunner(getExerciseImplementationClass()).getAllLinesPrintedInTheConsole();

		assertEquals("Missing lines to print", 11, console.size());
		assertEquals(9000, Integer.parseInt(console.get(1)));
		assertEquals(0.1, Double.parseDouble(console.get(3)), 0);
		assertEquals("Zetor", console.get(5));

	}

	@Override
	protected Class<?> determineImplementationClass() throws ClassNotFoundException {
		return SolutionExercise4.class;
	}

}
