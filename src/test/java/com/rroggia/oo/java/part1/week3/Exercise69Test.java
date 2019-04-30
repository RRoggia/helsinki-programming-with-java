package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class Exercise69Test {

	@Test
	public void wordIsPalindrome() {
		testImplementationOfPalindrome(Exercise69.class, true, "madam");
	}

	@Test
	public void wordIsNotPalindrome() {
		testImplementationOfPalindrome(Exercise69.class, false, "example");
	}

	public static void testImplementationOfPalindrome(Class<?> implementationClass, boolean expectedResult,
			String text) {
		try {
			Method instanceMethod = implementationClass.getMethod("palindrome", String.class);

			Object invokeResult = instanceMethod.invoke(null, text);

			boolean result;

			if (invokeResult != null)
				result = (boolean) invokeResult;
			else
				throw new IllegalArgumentException();

			if (expectedResult)
				assertTrue(result);
			else
				assertFalse(result);

		} catch (NoSuchMethodException e) {
			fail("Create the method palindrome,that checks if a string is a palindrome.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static boolean palindrome(String text)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}

	}
}
