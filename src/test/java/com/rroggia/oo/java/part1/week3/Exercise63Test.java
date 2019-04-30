package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

public class Exercise63Test {

	@Test
	public void sumArrayNumbers() {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		testImplementationOfSum(Exercise63.class, 14, numbers);

	}

	public static void testImplementationOfSum(Class<?> implementationClass, int expectedResult,
			ArrayList<Integer> list) {
		try {
			Method instanceMethod = implementationClass.getMethod("sum", ArrayList.class);

			Object invokeResult = instanceMethod.invoke(null, list);

			int result;

			if (invokeResult != null)
				result = (int) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(expectedResult, result);

		} catch (NoSuchMethodException e) {
			fail("Create the method sum, that calculates the sum of the items in that list.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static int sum(ArrayList<Integer> list)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}

	}

}
