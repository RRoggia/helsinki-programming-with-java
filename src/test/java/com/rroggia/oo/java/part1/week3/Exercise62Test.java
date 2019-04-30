package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.week3.Exercise62;

public class Exercise62Test {

	@Test
	public void removeLast() {
		ArrayList<String> brothers = new ArrayList<String>();
		brothers.add("Dick");
		brothers.add("Henry");
		brothers.add("Michael");
		brothers.add("Bob");

		int expectedSizeAfterRemoveLast = brothers.size() - 1;

		Exercise62.removeLast(brothers);

		assertEquals("The list has the same size. Did you forgot to remove ?", expectedSizeAfterRemoveLast, brothers.size());

		assertFalse("The list still contain the last element, Did you removed the last one?", brothers.contains("Bob"));

	}

}
