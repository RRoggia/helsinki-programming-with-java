package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

public class Exercise68Test {

	private static final ArrayList<Integer> numbers = new ArrayList<Integer>();

	static {
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);
	}

	@Test
	public void containsNumberTwice() {

		testImplementationOfMoreThanOnce(Exercise68.class, true, numbers, 2);
	}

	@Test
	public void containsNumberOnce() {
		testImplementationOfMoreThanOnce(Exercise68.class, false, numbers, 3);
	}

	public static void testImplementationOfMoreThanOnce(Class<?> implementationClass, boolean expectedResult,
			ArrayList<Integer> list, int number) {
		try {
			Method instanceMethod = implementationClass.getMethod("moreThanOnce", ArrayList.class, int.class);

			Object invokeResult = instanceMethod.invoke(null, list, number);

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
			fail("Create the method moreThanOnce, returns true if the number appears on the list more than once the method otherwise false");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static boolean moreThanOnce(ArrayList<Integer> list, int number)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}

	}

}
