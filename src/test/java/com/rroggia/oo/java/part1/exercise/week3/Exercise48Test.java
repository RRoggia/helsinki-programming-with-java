package com.rroggia.oo.java.part1.exercise.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise48;

public class Exercise48Test {

	@Test
	public void firstCharacter() {
		testImplementationOfFirstCharacter(Exercise48.class);
	}

	public static void testImplementationOfFirstCharacter(Class<?> implementationClass) {
		try {
			Method instanceMethod = implementationClass.getMethod("firstCharacter", String.class);

			String text = "Catherine";
			Object invokeResult = instanceMethod.invoke(null, text);
			char result;

			if (invokeResult != null)
				result = (char) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(text.charAt(0), result);

		} catch (NoSuchMethodException e) {
			fail("Create the method firstCharacter, which returns the first character.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static char firstCharacter(String text)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}
	}

}
