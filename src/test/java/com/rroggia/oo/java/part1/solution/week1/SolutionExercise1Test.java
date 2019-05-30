package com.rroggia.oo.java.part1.solution.week1;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import com.rroggia.oo.java.part1.MockConsoleOutput;

public class SolutionExercise1Test {

	@Test
	public void testIfPrintedJaneDone() {

		ByteArrayOutputStream outputBytesFromConsole = MockConsoleOutput.getMockedOutputStream();

		SolutionExercise1.main(null);

		String printed = outputBytesFromConsole.toString().replace("\n", "").replace("\r", "");

		assertEquals("Jane Doe", printed);

	}

}
