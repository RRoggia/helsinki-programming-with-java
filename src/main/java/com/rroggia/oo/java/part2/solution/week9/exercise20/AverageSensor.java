package com.rroggia.oo.java.part2.solution.week9.exercise20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AverageSensor implements Sensor {

	private Set<Sensor> sensors = new HashSet<>();
	private List<Integer> measurements = new ArrayList<>();

	public void addSensor(Sensor sensor) {
		sensors.add(sensor);
	}

	@Override
	public boolean isOn() {
		for (Sensor sensor : sensors) {
			if (!sensor.isOn()) {
				return false;
			}
		}

		return true;
	}

	@Override
	public void on() {
		for (Sensor sensor : sensors)
			sensor.on();
	}

	@Override
	public void off() {
		for (Sensor sensor : sensors)
			sensor.off();
	}

	@Override
	public int measure() {
		if (!isOn()) {
			throw new IllegalStateException("AverageSensor is off");
		}

		if (sensors.isEmpty()) {
			throw new IllegalStateException("AverageSensor is empty");
		}

		int sum = 0;
		for (Sensor sensor : sensors) {
			sum += sensor.measure();
		}
		int average = sum / sensors.size();
		measurements.add(average);
		return average;
	}

	public List<Integer> readings() {
		return measurements;
	}

}
