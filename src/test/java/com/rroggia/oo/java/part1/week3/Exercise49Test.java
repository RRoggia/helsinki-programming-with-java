package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class Exercise49Test {

	@Test
	public void lastCharacter() {
		testImplementationOfLastCharacter(Exercise49.class);
	}

	public static void testImplementationOfLastCharacter(Class<?> implementationClass) {
		try {
			Method instanceMethod = implementationClass.getMethod("lastCharacter", String.class);

			String text = "Catherine";
			Object invokeResult = instanceMethod.invoke(null, text);
			char result;

			if (invokeResult != null)
				result = (char) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(text.charAt(text.length() - 1), result);

		} catch (NoSuchMethodException e) {
			fail("Create the method lastCharacter, which returns the last character.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static char lastCharacter (String text)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}
	}

}
