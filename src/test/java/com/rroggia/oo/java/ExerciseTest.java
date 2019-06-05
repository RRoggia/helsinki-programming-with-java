package com.rroggia.oo.java;

public abstract class ExerciseTest {

	protected abstract Class<?> determineImplementationClass() throws ClassNotFoundException;

	public Class<?> getExerciseImplementationClass() {
		try {
			return determineImplementationClass();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(missingImplementationClass());
		}

	}

	public String missingImplementationClass() {
		StringBuilder message = new StringBuilder();
		message.append("Missing implementation class for ").append(this.getClass().getSimpleName()).append(".");
		message.append("Expected implementation class named as ")
				.append(this.getClass().getSimpleName().replace("Test", "")).append(".");
		return message.toString();
	}
}
