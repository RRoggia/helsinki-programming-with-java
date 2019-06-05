package com.rroggia.oo.java.part1.exercise.week1;

public class Exercise4 {
	
	/**
	 * Exercise 4.
	 * Change the program in the specified places so that it will print:
	 * Chickens:
	 * 9000
	 * Bacon (kg):
	 * 0.1
	 * A tractor:
	 * Zetor
	 * 
	 * In a nutshell:
	 * 9000
	 * 0.1
	 * Zetor
	 */
	public static void main(String[] args) {
		int chickensNumber = 3; //change here
		double baconKg = 5.5; //change here
		String tractor = "There is none!"; //change here

		System.out.println("Chickens:");
		System.out.println(chickensNumber);
		System.out.println("Bacon (kg):");
		System.out.println(baconKg);
		System.out.println("A tractor:");
		System.out.println(tractor);

		System.out.println();

		System.out.println("In a nutshell:");
		System.out.println(chickensNumber);
		System.out.println(baconKg);
		System.out.println(tractor);
	}
}
