package com.rroggia.oo.java.part1.exercise.week5;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Test;

import com.rroggia.oo.java.part1.solution.week5.SolutionCounter;

public class CounterTest {

	@Test
	public void instantiateCounterEmptyConstructor() {
		Constructor<SolutionCounter> constructor = TestInstanceGenerator.getConstructor(SolutionCounter.class);
		SolutionCounter counter = TestInstanceGenerator.getInstanceOfClass(SolutionCounter.class, constructor);

		assertEquals(0, counter.value());

		counter.decrease();
		assertEquals(-1, counter.value());

	}

	@Test
	public void instantiateCounterWithBoolean() {
		Constructor<SolutionCounter> constructor = TestInstanceGenerator.getConstructor(SolutionCounter.class,
				boolean.class);
		SolutionCounter counter = TestInstanceGenerator.getInstanceOfClass(SolutionCounter.class, constructor, true);

		assertEquals(0, counter.value());

		counter.decrease();
		assertEquals(0, counter.value());

	}

	@Test
	public void instantiateCounterWithInteger() {
		Constructor<SolutionCounter> constructor = TestInstanceGenerator.getConstructor(SolutionCounter.class,
				int.class);
		SolutionCounter counter = TestInstanceGenerator.getInstanceOfClass(SolutionCounter.class, constructor, -1);

		assertEquals(-1, counter.value());

		counter.decrease();
		assertEquals(-2, counter.value());

	}

	@Test
	public void instantiateCounterWithBooleanAndInteger() {
		Constructor<SolutionCounter> constructor = TestInstanceGenerator.getConstructor(SolutionCounter.class,
				int.class, boolean.class);
		SolutionCounter counter = TestInstanceGenerator.getInstanceOfClass(SolutionCounter.class, constructor, 1, true);

		assertEquals(1, counter.value());

		counter.decrease();
		assertEquals(0, counter.value());

	}

	@Test
	public void increaseMultiple() {
		Constructor<SolutionCounter> constructor = TestInstanceGenerator.getConstructor(SolutionCounter.class);
		SolutionCounter counter = TestInstanceGenerator.getInstanceOfClass(SolutionCounter.class, constructor);

		assertEquals(0, counter.value());
		counter.increase(10);
		assertEquals(10, counter.value());
	}

	@Test
	public void increaseMultipleNegative() {
		Constructor<SolutionCounter> constructor = TestInstanceGenerator.getConstructor(SolutionCounter.class);
		SolutionCounter counter = TestInstanceGenerator.getInstanceOfClass(SolutionCounter.class, constructor);

		assertEquals(0, counter.value());
		counter.increase(-3);
		assertEquals(0, counter.value());
	}

	@Test
	public void decreaseMultiple() {
		Constructor<SolutionCounter> constructor = TestInstanceGenerator.getConstructor(SolutionCounter.class);
		SolutionCounter counter = TestInstanceGenerator.getInstanceOfClass(SolutionCounter.class, constructor);

		assertEquals(0, counter.value());
		counter.increase(10);
		assertEquals(10, counter.value());

		counter.decrease(3);
		assertEquals(7, counter.value());
	}

	@Test
	public void decreaseMultipleNegative() {
		Constructor<SolutionCounter> constructor = TestInstanceGenerator.getConstructor(SolutionCounter.class);
		SolutionCounter counter = TestInstanceGenerator.getInstanceOfClass(SolutionCounter.class, constructor);

		assertEquals(0, counter.value());
		counter.increase(2);
		assertEquals(2, counter.value());
		counter.increase(-3);
		assertEquals(2, counter.value());
	}

}
