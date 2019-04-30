package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class Exercise68Test {

	private static final ArrayList<Integer> numbers = new ArrayList<Integer>();

	static {
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);
	}

	@Test
	public void containsNumberTwice() {
		assertTrue(Exercise68.moreThanOnce(numbers, 2));
	}

	@Test
	public void containsNumberOnce() {
		assertFalse(Exercise68.moreThanOnce(numbers, 3));
	}

}
