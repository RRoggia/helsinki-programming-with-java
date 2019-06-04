package com.rroggia.oo.java.part1.solution.week1;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.rroggia.oo.java.ExerciseRunner;
import com.rroggia.oo.java.ExerciseTest;

public class SolutionExercise3Test extends ExerciseTest {

	@Test
	public void printedSpruce() {
		List<String> console = new ExerciseRunner(getExerciseImplementationClass1()).getAllLinesPrintedInTheConsole();

		assertEquals("Missing lines to print", 6, console.size());

		assertEquals("    *    ", console.get(0));
		assertEquals("   ***   ", console.get(1));
		assertEquals("  *****  ", console.get(2));
		assertEquals(" ******* ", console.get(3));
		assertEquals("*********", console.get(4));
		assertEquals("    *    ", console.get(5));
	}

	@Override
	protected Class<?> determineImplementationClass() throws ClassNotFoundException {
		return SolutionExercise3.class;
	}

}
