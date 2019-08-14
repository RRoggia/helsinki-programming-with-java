package com.rroggia.oo.java.part2.solution.week9.exercise20;

import java.util.Random;

public class Thermometer implements Sensor {

	private boolean isOn = false;

	@Override
	public boolean isOn() {
		return isOn;
	}

	@Override
	public void on() {
		isOn = true;
	}

	@Override
	public void off() {
		isOn = false;
	}

	@Override
	public int measure() {
		if (!isOn())
			throw new IllegalStateException("Thermometer is off.");

		final Random randomGenerator = new Random();
		return randomGenerator.nextInt(61) - 30;
	}

}
