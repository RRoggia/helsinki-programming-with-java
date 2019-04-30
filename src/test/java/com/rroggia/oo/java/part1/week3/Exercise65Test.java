package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

public class Exercise65Test {
	@Test
	public void lenghtOfStrings() {
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> expectedLenghts = new ArrayList<>();

		addWordToArrays("Hello", words, expectedLenghts);
		addWordToArrays("Moi", words, expectedLenghts);
		addWordToArrays("Benvenuto!", words, expectedLenghts);
		addWordToArrays("badger badger badger badger", words, expectedLenghts);

		testImplementationOfLengths(Exercise65.class, expectedLenghts, words);

	}

	private void addWordToArrays(String word, ArrayList<String> words, ArrayList<Integer> expectedLenghts) {
		words.add(word);
		expectedLenghts.add(word.length());
	}

	public static void testImplementationOfLengths(Class<?> implementationClass, ArrayList<Integer> expectedResult,
			ArrayList<String> list) {
		try {
			Method instanceMethod = implementationClass.getMethod("lenghts", ArrayList.class);

			Object invokeResult = instanceMethod.invoke(null, list);

			ArrayList<Integer> result;
			
			// if the method is returning null we may have a false positive
			if (invokeResult != null)
				result = (ArrayList<Integer>) invokeResult;
			else
				throw new IllegalArgumentException();

			assertArrayEquals(expectedResult.toArray(), result.toArray());

		} catch (NoSuchMethodException e) {
			fail("Create the method lenghts, that returns an ArrayList that contains the lengths of the Strings in the same order as the original list.");
		} catch (ClassCastException | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
			fail("Your method must follow: public static ArrayList<Integer> lengths(ArrayList<String> list)");
		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getMessage());
		}

	}

}
