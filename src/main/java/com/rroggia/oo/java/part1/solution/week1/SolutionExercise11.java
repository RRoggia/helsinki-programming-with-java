package com.rroggia.oo.java.part1.solution.week1;

import java.util.Scanner;

public class SolutionExercise11 {
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Type a number: ");
			int firstNumber = Integer.parseInt(reader.nextLine());

			System.out.println("Type another number: ");
			int secondNumber = Integer.parseInt(reader.nextLine());

			System.out
					.println("The bigger number of the two numbers given was: " + Math.max(firstNumber, secondNumber));

		}
	}

}
