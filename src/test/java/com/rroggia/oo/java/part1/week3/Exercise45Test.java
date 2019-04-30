package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class Exercise45Test {

	@Test
	public void firstParameterIsGreatest() {
		Exercise45Test.greatest(10, 10, 3, 2);
	}

	@Test
	public void secondParameterIsGreatest() {
		Exercise45Test.greatest(11, -5, 11, 0);
	}

	@Test
	public void thirdParameterIsGreatest() {
		Exercise45Test.greatest(5, 3, 3, 5);
	}

	@Test
	public void parametersAreEqual() {
		Exercise45Test.greatest(4, 4, 4, 4);
	}

	private static void greatest(int expectedResult, int number1, int number2, int number3) {
		try {
			Method staticMethod = Exercise45.class.getMethod("greatest", int.class, int.class, int.class);
			Object invokeResult = staticMethod.invoke(null, number1, number2, number3);
			int result;

			if (invokeResult != null)
				result = (int) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(expectedResult, result);

		} catch (NoSuchMethodException e) {
			fail("Create the method greatest, which gets three integers as parameters and then returns the greatest of them.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static int greatest(int number1, int number2, int number3)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}
	}

}
