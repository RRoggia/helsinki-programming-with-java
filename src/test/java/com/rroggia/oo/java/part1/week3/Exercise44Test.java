package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rroggia.oo.java.part1.week3.Exercise44;

public class Exercise44Test {

	@Test
	public void firstParameterIsTheLeast() {
		assertEquals(1, Exercise44.least(1, 8));
	}

	@Test
	public void secondParameterIsTheLeast() {
		assertEquals(3, Exercise44.least(8, 3));
	}

	@Test
	public void parametersAreEqual() {
		assertEquals(4, Exercise44.least(4, 4));
	}

}
