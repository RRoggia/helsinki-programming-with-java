package com.rroggia.oo.java.part1.exercise.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise66;

public class Exercise66Test {

	@Test
	public void greatest() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		testImplementationOfGreatest(Exercise66.class, 7, numbers);

	}

	@Test
	public void allTheSameNumber() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(3);
		numbers.add(3);
		numbers.add(3);
		testImplementationOfGreatest(Exercise66.class, 3, numbers);

	}

	public static void testImplementationOfGreatest(Class<?> implementationClass, int expectedResult,
			ArrayList<Integer> list) {
		try {
			Method instanceMethod = implementationClass.getMethod("greatest", ArrayList.class);

			Object invokeResult = instanceMethod.invoke(null, list);

			int result;

			if (invokeResult != null)
				result = (int) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(expectedResult, result);

		} catch (NoSuchMethodException e) {
			fail("Create the method greatest, that returns the greatest number in the list as a return value.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static int greatest(ArrayList<Integer> list)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}

	}

}
