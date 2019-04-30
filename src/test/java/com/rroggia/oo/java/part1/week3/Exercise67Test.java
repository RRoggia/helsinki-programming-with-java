package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

public class Exercise67Test {

	@Test
	public void variance() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		testImplementationOfVariance(Exercise67.class, 5.666667, numbers);

	}
	
	public static void testImplementationOfVariance(Class<?> implementationClass, double expectedResult,
			ArrayList<Integer> list) {
		try {
			Method instanceMethod = implementationClass.getMethod("variance", ArrayList.class);

			Object invokeResult = instanceMethod.invoke(null, list);

			double result;

			if (invokeResult != null)
				result = (double) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(expectedResult, result, 0.01);

		} catch (NoSuchMethodException e) {
			fail("Create the method variance, then returns the sample variance of that list.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static double variance(ArrayList<Integer> list)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}

	}

}
