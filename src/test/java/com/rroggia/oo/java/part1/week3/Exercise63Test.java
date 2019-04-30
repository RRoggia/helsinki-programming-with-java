package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.week3.Exercise63;

public class Exercise63Test {

	@Test
	public void sumArrayNumbers() {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		assertEquals(14, Exercise63.sum(numbers));
	}

}
