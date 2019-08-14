package com.rroggia.oo.java.part1.solution.week1;

import java.util.Scanner;

public class SolutionExercise21 {
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Type a year:");
			int year = Integer.parseInt(reader.nextLine());

			if (!(year % 4 == 0) || (year % 100 == 0 && !(year % 400 == 0))) {
				System.out.println("The year is not a leap year.");
			} else {
				System.out.println("The year is a leap year.");
			}
		}
	}
}
