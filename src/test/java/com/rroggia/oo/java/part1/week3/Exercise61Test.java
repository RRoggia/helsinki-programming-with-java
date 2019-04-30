package com.rroggia.oo.java.part1.week3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.rroggia.oo.java.part1.week3.Exercise61;

public class Exercise61Test {

	@Test
	public void countItems() {
		ArrayList<String> names = new ArrayList<>();
		names.add("Ciao");
		names.add("Hallo");
		names.add("Hello");
		names.add("Ola");

		assertEquals(4, Exercise61.countItems(names));

	}

}
