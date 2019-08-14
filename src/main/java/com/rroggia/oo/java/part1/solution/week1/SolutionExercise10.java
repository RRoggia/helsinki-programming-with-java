package com.rroggia.oo.java.part1.solution.week1;

import java.util.Scanner;

public class SolutionExercise10 {

	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Type the radius: ");
			int radius = Integer.parseInt(reader.nextLine());

			System.out.println("Circumference of the circle: " + 2 * Math.PI * radius);
		}
	}

}
