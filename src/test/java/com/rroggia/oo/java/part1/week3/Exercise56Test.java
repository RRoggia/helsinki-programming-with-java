package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class Exercise56Test {

	@Test
	public void reverse() {
		testImplementationOfReverse(Exercise56.class);
	}

	public static void testImplementationOfReverse(Class<?> implementationClass) {
		try {
			Method instanceMethod = implementationClass.getMethod("reverse", String.class);

			String text = "Catherine";
			Object invokeResult = instanceMethod.invoke(null, text);
			String result;

			if (invokeResult != null)
				result = (String) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(new StringBuilder(text).reverse().toString(), result);

		} catch (NoSuchMethodException e) {
			fail("Create the method reverse that puts the given string in reversed order.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static String reverse(String text)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}
	}

}
