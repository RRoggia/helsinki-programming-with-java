package com.rroggia.oo.java.part1.solution.week1;

import java.util.Scanner;

public class SolutionExercise16 {
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Type a number: ");
			int number = Integer.parseInt(reader.nextLine());

			if (number % 2 == 0) {
				System.out.println("Number " + number + " is even.");
			} else {
				System.out.println("Number " + number + " is odd.");
			}
		}
	}
}
