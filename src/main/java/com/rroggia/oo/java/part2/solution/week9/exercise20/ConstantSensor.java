package com.rroggia.oo.java.part2.solution.week9.exercise20;

public class ConstantSensor implements Sensor {

	private int measurement;

	public ConstantSensor(int measurement) {
		this.measurement = measurement;
	}

	@Override
	public boolean isOn() {
		return true;
	}

	@Override
	public void on() {
		// don't do anything, it's always on.
	}

	@Override
	public void off() {
		// don't do anything, it's always on.
	}

	@Override
	public int measure() {
		return measurement;
	}

}
