package com.rroggia.oo.java.part1.exercise.week1;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import com.rroggia.oo.java.part1.MockConsoleOutput;

public class Exercise1Test {

	@Test
	public void testIfPrintedJaneDone() {
		ByteArrayOutputStream outputBytesFromConsole = MockConsoleOutput.getMockedOutputStream();
		Exercise1.main(null);

		String result = outputBytesFromConsole.toString().replace("\n", "").replace("\r", "");

		assertEquals("Jane Doe", result);
	}

}
