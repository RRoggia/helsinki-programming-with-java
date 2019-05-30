package com.rroggia.oo.java;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MockConsoleOutput {

	public static ByteArrayOutputStream getMockedOutputStream() {
		ByteArrayOutputStream outputBytesFromConsole = new ByteArrayOutputStream();
		PrintStream myConsole = new PrintStream(outputBytesFromConsole);
		System.setOut(myConsole);
		return outputBytesFromConsole;
	}

}
