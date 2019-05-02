package com.rroggia.oo.java.part1.exercise.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise46;

public class Exercise46Test {

	@Test
	public void average() {
		testImplementationOfAverageMethod(Exercise46.class, 3.5, 4, 3, 6, 1);
	}

	public static void testImplementationOfAverageMethod(Class<?> implementationClass, double expectedResult,
			int number1, int number2, int number3, int number4) {
		try {
			Method instanceMethod = implementationClass.getMethod("average", int.class, int.class, int.class, int.class);
			Object invokeResult = instanceMethod.invoke(null, number1, number2, number3, number4);
			double result;

			if (invokeResult != null)
				result = (double) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(expectedResult, result, 0.0);

		} catch (NoSuchMethodException e) {
			fail("Create the method average, which calculates the average of the numbers it gets as parameters.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static double average(int number1, int number2, int number3, int number4)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}
	}

}
