package com.rroggia.oo.java.part1.exercise.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise43;

public class Exercise43Test {

	@Test
	public void sum() throws SecurityException, InvocationTargetException {
		testImplementationOfSumMethod(Exercise43.class);
	}

	public static void testImplementationOfSumMethod(Class<?> implementationClass) {
		try {
			Method staticMethod = implementationClass.getMethod("sum", int.class, int.class, int.class, int.class);
			Object invokeResult = staticMethod.invoke(null, 1, 2, 3, 4);
			int result;

			if (invokeResult != null)
				result = (int) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(10, result);

		} catch (NoSuchMethodException e) {
			fail("Create the method sum that calculates the sum of numbers the method receives as parameters.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static int sum(int number1, int number2, int number3, int number4)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}
	}

}
