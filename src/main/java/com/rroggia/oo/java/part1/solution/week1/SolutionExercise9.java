package com.rroggia.oo.java.part1.solution.week1;

import java.util.Scanner;

public class SolutionExercise9 {
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Type a number:");
			int dividend = Integer.parseInt(reader.nextLine());

			System.out.println("Type another number:");
			int divisor = Integer.parseInt(reader.nextLine());

			double quotient = (double) dividend / divisor;

			System.out.println("Division: " + dividend + " / " + divisor + " = " + quotient);
		}

	}
}
