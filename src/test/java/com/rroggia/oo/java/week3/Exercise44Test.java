package com.rroggia.oo.java.week3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise44Test {

	@Test
	public void firstParameterIsTheLeast() {
		assertEquals(Exercise44.least(1, 8), 1);
	}

	@Test
	public void secondParameterIsTheLeast() {
		assertEquals(Exercise44.least(8, 3), 3);
	}

	@Test
	public void parametersAreEqual() {
		assertEquals(Exercise44.least(4, 4), 4);
	}

}
