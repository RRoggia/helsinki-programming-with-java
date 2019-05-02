package com.rroggia.oo.java.part1.solution.week3;

import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.exercise.week3.Exercise65Test;

public class SolutionExercise65Test {

	@Test
	public void lenghtOfStrings() {
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> expectedLenghts = new ArrayList<>();

		addWordToArrays("Hello", words, expectedLenghts);
		addWordToArrays("Moi", words, expectedLenghts);
		addWordToArrays("Benvenuto!", words, expectedLenghts);
		addWordToArrays("badger badger badger badger", words, expectedLenghts);

		Exercise65Test.testImplementationOfLengths(SolutionExercise65.class, expectedLenghts, words);

	}

	private void addWordToArrays(String word, ArrayList<String> words, ArrayList<Integer> expectedLenghts) {
		words.add(word);
		expectedLenghts.add(word.length());
	}

}
