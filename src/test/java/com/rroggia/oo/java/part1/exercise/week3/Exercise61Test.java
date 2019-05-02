package com.rroggia.oo.java.part1.exercise.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise61;

public class Exercise61Test {

	@Test
	public void countItems() {
		ArrayList<String> names = new ArrayList<>();
		names.add("Ciao");
		names.add("Hallo");
		names.add("Hello");
		names.add("Ola");

		testImplementationOfCountItems(Exercise61.class, 4, names);

	}

	public static void testImplementationOfCountItems(Class<?> implementationClass, int expectedResult,
			ArrayList<String> list) {
		try {
			Method instanceMethod = implementationClass.getMethod("countItems", ArrayList.class);

			Object invokeResult = instanceMethod.invoke(null, list);
			int result;

			if (invokeResult != null)
				result = (int) invokeResult;
			else
				throw new IllegalArgumentException();

			assertEquals(expectedResult, result);

		} catch (NoSuchMethodException e) {
			fail("Create the method countItems, that returns the number of the items in the list.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static int countItems(ArrayList<String> list)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}

	}

}
