package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

public class Exercise62Test {

	@Test
	public void removeLast() {
		ArrayList<String> brothers = new ArrayList<String>();
		brothers.add("Dick");
		brothers.add("Henry");
		brothers.add("Michael");
		brothers.add("Bob");

		int expectedSizeAfterRemoveLast = brothers.size() - 1;

		testImplementationOfRemoveLast(Exercise62.class, expectedSizeAfterRemoveLast, brothers);

	}

	public static void testImplementationOfRemoveLast(Class<?> implementationClass, int expectedResult,
			ArrayList<String> list) {
		try {
			Method instanceMethod = implementationClass.getMethod("removeLast", ArrayList.class);

			instanceMethod.invoke(null, list);

			assertEquals("The list has the same size. Did you forgot to remove ?", expectedResult, list.size());

			assertFalse("The list still contain the last element, Did you removed the last one?", list.contains("Bob"));

		} catch (NoSuchMethodException e) {
			fail("Create the method countItems,  which removes the last item from the list.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static void removeLast(ArrayList<String> list)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}

	}

}
