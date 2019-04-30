package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class Exercise44Test {

	@Test
	public void firstParameterIsTheLeast() {
		Exercise44Test.least(1, 1, 8);
	}

	@Test
	public void secondParameterIsTheLeast() {
		Exercise44Test.least(3, 8, 3);
	}

	@Test
	public void parametersAreEqual() {
		Exercise44Test.least(4, 4, 4);
	}

	private static void least(int expectedResult, int number1, int number2) {
		try {
			Method staticMethod = Exercise44.class.getMethod("least", int.class, int.class);
			Object invokeResult = staticMethod.invoke(null, number1, number2);
			int result;

			if (invokeResult != null)
				result = (int) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(expectedResult, result);

		} catch (NoSuchMethodException e) {
			fail("Create the method least, which returns the least of the numbers given as parameters.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static int least(int number1, int number2)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}
	}

}
