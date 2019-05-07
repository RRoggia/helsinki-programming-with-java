package com.rroggia.oo.java.part1.solution.week5;

public class SolutionCounter {

	private boolean check = false;
	private int counter = 0;

	public SolutionCounter() {
	}

	public SolutionCounter(boolean check) {
		this.check = check;
	}

	public SolutionCounter(int startingValue) {
		this.counter = startingValue;
	}

	public SolutionCounter(int startingValue, boolean check) {
		this.check = check;
		if (this.check(startingValue))
			this.counter = 0;
		else
			this.counter = startingValue;

	}

	public int value() {
		return counter;
	}

	public void increase() {
		this.counter++;
	}

	public void decrease() {
		if (this.check(this.counter))
			return;

		this.counter--;
	}

	private boolean check(int value) {
		return check && value <= 0;
	}
}
