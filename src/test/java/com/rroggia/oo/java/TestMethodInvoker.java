package com.rroggia.oo.java;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestMethodInvoker {

	private static final String MAIN = "main";

	public static void invokeMainFromClass(Class<?> testClass, String... args) {
		String[] mainArgs = Arrays.copyOfRange(args, 0, args.length);

		for (Method method : testClass.getDeclaredMethods()) {
			if (MAIN.equals(method.getName())) {
				try {
					method.invoke(null, (Object) mainArgs);
					return;
				} catch (IllegalAccessException | IllegalArgumentException e) {
					throw new RuntimeException("Error invoking main method of the class " + testClass.getSimpleName()
							+ " " + e.getMessage());
				} catch (InvocationTargetException e) {
					throw new RuntimeException(e.getTargetException().getMessage());
				}
			}
		}

		throw new RuntimeException("Missing main method in the class " + testClass.getSimpleName());
	}

}
