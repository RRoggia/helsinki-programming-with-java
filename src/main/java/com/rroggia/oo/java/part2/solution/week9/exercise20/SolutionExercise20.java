package com.rroggia.oo.java.part2.solution.week9.exercise20;

public class SolutionExercise20 {

	public static void main(String[] args) {
		constantSensor();
		thermometer();
		averageSensor();
		allReadings();
	}

	private static void constantSensor() {
		System.out.println("Exercise 20.1: Constant Sensor");

		Sensor ten = new ConstantSensor(10);
		Sensor minusFive = new ConstantSensor(-5);

		System.out.println(ten.measure());
		System.out.println(minusFive.measure());

		System.out.println(ten.isOn());
		ten.off();
		System.out.println(ten.isOn());
		System.out.println();
	}

	private static void thermometer() {
		System.out.println("Exercise 20.2: Thermometer");

		Sensor thermometer = new Thermometer();
		try {
			thermometer.measure();
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}

		thermometer.on();
		System.out.println(thermometer.measure());
		System.out.println(thermometer.measure());
		System.out.println(thermometer.measure());
		System.out.println();
	}

	private static void averageSensor() {
		System.out.println("Exercise 20.3: AverageSensor");

		Sensor kumpula = new Thermometer();
		kumpula.on();
		System.out.println("the temperature in Kumpula is " + kumpula.measure() + " degrees");

		Sensor kaisaniemi = new Thermometer();
		Sensor helsinkiVantaa = new Thermometer();

		AverageSensor helsinkiArea = new AverageSensor();
		helsinkiArea.addSensor(kumpula);
		helsinkiArea.addSensor(kaisaniemi);
		helsinkiArea.addSensor(helsinkiVantaa);

		helsinkiArea.on();
		System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
		System.out.println();

	}

	private static void allReadings() {
		System.out.println("Exercise 20.4: All Readings.");

		Sensor kumpula = new Thermometer();
		Sensor kaisaniemi = new Thermometer();
		Sensor helsinkiVantaa = new Thermometer();

		AverageSensor helsinkiArea = new AverageSensor();
		helsinkiArea.addSensor(kumpula);
		helsinkiArea.addSensor(kaisaniemi);
		helsinkiArea.addSensor(helsinkiVantaa);

		helsinkiArea.on();
		System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
		System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
		System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");

		System.out.println("readings: " + helsinkiArea.readings());

	}
}
