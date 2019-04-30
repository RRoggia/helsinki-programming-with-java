package com.rroggia.oo.java.week3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise45Test {

	@Test
	public void firstParameterIsGreatest() {
		assertEquals(Exercise45.greatest(10, 3, 2), 10);
	}

	@Test
	public void secondParameterIsGreatest() {
		assertEquals(Exercise45.greatest(-5, 11, 0), 11);
	}

	@Test
	public void thirdParameterIsGreatest() {
		assertEquals(Exercise45.greatest(3, 3, 5), 5);
	}

	@Test
	public void parametersAreEqual() {
		assertEquals(Exercise45.greatest(4, 4, 4), 4);
	}

}
