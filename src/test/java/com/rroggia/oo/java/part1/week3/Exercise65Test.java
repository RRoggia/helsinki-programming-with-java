package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

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

		ArrayList<Integer> lenghts = Exercise65.lenghts(words);

		if (lenghts == null) {
			fail();
		}

		assertArrayEquals(expectedLenghts.toArray(), lenghts.toArray());
	}

	private void addWordToArrays(String word, ArrayList<String> words, ArrayList<Integer> expectedLenghts) {
		words.add(word);
		expectedLenghts.add(word.length());
	}

}
