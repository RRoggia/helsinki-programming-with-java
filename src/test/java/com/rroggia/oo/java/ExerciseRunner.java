package com.rroggia.oo.java;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;

public class ExerciseRunner {

	private Class<?> testClass;

	public ExerciseRunner(Class<?> testClass) {
		this.testClass = testClass;
	}

	public String getOneLinePrintedInTheConsole() {
		return getAllLinesPrintedInTheConsole().get(0);
	}

	public List<String> getAllLinesPrintedInTheConsole() {
		ByteArrayOutputStream responseAsBytes = invokeMainUsingMockConsole();
		String response = responseAsBytes.toString().replace("\r", "");
		String[] split = response.split("\n");

		if (split == null || split.length == 0) {
			throw new RuntimeException("Did not print in the console.");
		}

		return Arrays.asList(split);

	}

	private ByteArrayOutputStream invokeMainUsingMockConsole() {
		ByteArrayOutputStream responseAsBytes = MockConsoleOutput.getMockedOutputStream();
		TestMethodInvoker.invokeMainFromClass(testClass);
		return responseAsBytes;
	}
}
