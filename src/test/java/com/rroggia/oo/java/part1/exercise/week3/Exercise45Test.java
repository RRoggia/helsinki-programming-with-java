package com.rroggia.oo.java.part1.exercise.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise45;

public class Exercise45Test {

	@Test
	public void firstParameterIsGreatest() {
		testImplementationOfGreatestMethod(Exercise45.class, 10, 10, 3, 2);
	}

	@Test
	public void secondParameterIsGreatest() {
		testImplementationOfGreatestMethod(Exercise45.class, 11, -5, 11, 0);
	}

	@Test
	public void thirdParameterIsGreatest() {
		testImplementationOfGreatestMethod(Exercise45.class, 5, 3, 3, 5);
	}

	@Test
	public void parametersAreEqual() {
		testImplementationOfGreatestMethod(Exercise45.class, 4, 4, 4, 4);
	}

	public static void testImplementationOfGreatestMethod(Class<?> implementationClass, int expectedResult, int number1,
			int number2, int number3) {
		try {
			Method staticMethod = implementationClass.getMethod("greatest", int.class, int.class, int.class);
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
