package com.rroggia.oo.java.part1.solution.week1;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.rroggia.oo.java.ExerciseRunner;
import com.rroggia.oo.java.ExerciseTest;

public class SolutionExercise2Test extends ExerciseTest {

	@Test
	public void printedHelloWorldAndAllPeopleOfTheWorld() {
		List<String> response = new ExerciseRunner(getExerciseImplementationClass()).getAllLinesPrintedInTheConsole();

		assertEquals("Hello world!", response.get(0));
		assertEquals("(And all the people of the world)", response.get(1));

	}

	@Override
	protected Class<?> determineImplementationClass() throws ClassNotFoundException {
		return SolutionExercise2.class;
	}

}
