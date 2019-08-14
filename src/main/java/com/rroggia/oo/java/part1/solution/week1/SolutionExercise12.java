package com.rroggia.oo.java.part1.solution.week1;

import java.util.Scanner;

public class SolutionExercise12 {
	public static void main(String[] args) {

		try (Scanner reader = new Scanner(System.in)) {
			String firstName = getName(reader);
			int firstAge = getAge(reader);

			String secondName = getName(reader);
			int secondAge = getAge(reader);

			System.out.println(
					firstName + " and " + secondName + " are " + (firstAge + secondAge) + " years old in total.");

		}

	}

	public static String getName(Scanner reader) {
		System.out.println("Type your name: ");
		return reader.nextLine();
	}

	public static int getAge(Scanner reader) {
		System.out.println("Type your age: ");
		return Integer.parseInt(reader.nextLine());
	}

}
