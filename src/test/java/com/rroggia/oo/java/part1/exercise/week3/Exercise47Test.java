package com.rroggia.oo.java.part1.exercise.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise47;

public class Exercise47Test {

	@Test
	public void lenghtOfText() {
		testImplementationOfCalculateCharacters(Exercise47.class);
	}

	public static void testImplementationOfCalculateCharacters(Class<?> implementationClass) {
		try {
			Method instanceMethod = implementationClass.getMethod("calculateCharacters", String.class);

			String text = "Catherine";
			Object invokeResult = instanceMethod.invoke(null, text);
			int result;

			if (invokeResult != null)
				result = (int) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(text.length(), result);

		} catch (NoSuchMethodException e) {
			fail("Create the method calculateCharacters, which returns how many characters the name contains.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static int calculateCharacters(String text)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}
	}

}
