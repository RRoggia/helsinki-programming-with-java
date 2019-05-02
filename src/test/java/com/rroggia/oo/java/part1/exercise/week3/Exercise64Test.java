package com.rroggia.oo.java.part1.exercise.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise64;

public class Exercise64Test {

	@Test
	public void averageArrayNumbers() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		testImplementationOfAverage(Exercise64.class, 3.5, numbers);
	}

	public static void testImplementationOfAverage(Class<?> implementationClass, double expectedResult,
			ArrayList<Integer> list) {
		try {
			Method instanceMethod = implementationClass.getMethod("average", ArrayList.class);

			Object invokeResult = instanceMethod.invoke(null, list);

			double result;

			if (invokeResult != null)
				result = (double) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(expectedResult, result, 0.0);

		} catch (NoSuchMethodException e) {
			fail("Create the method average, that calculates the average of the items in that list.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static double average(ArrayList<Integer> list)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}

	}

}
