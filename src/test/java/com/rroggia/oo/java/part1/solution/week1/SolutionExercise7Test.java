package com.rroggia.oo.java.part1.solution.week1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.rroggia.oo.java.ExerciseRunner;
import com.rroggia.oo.java.ExerciseTest;

public class SolutionExercise7Test extends ExerciseTest {

	@Test
	public void multiply() {
		List<String> console = new ExerciseRunner(getExerciseImplementationClass()).getAllLinesPrintedInTheConsole();

		for (String line : console) {
			assertTrue("Missing print the numbers to be multiplied.", line.contains("*"));
			assertTrue("Missing print the result of the multiply operation.", line.contains("="));

			String[] allValues = line.split("=");
			assertEquals("Missing operands or result.", 2, allValues.length);
			String result = allValues[1].trim();

			String[] multiplyValues = allValues[0].split("\\*");
			assertEquals("Missing operands.", 2, multiplyValues.length);
			String firstValue = multiplyValues[0].trim();
			String secondValue = multiplyValues[1].trim();

			assertEquals(Integer.parseInt(result), Integer.parseInt(firstValue) * Integer.parseInt(secondValue));
		}
	}

	@Override
	protected Class<?> determineImplementationClass() throws ClassNotFoundException {
		return SolutionExercise7.class;
	}
}
