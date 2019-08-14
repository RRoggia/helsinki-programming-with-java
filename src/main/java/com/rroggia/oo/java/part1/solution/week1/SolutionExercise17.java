package com.rroggia.oo.java.part1.solution.week1;

import java.util.Scanner;

public class SolutionExercise17 {
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Type the first number:");
			int firstNumber = Integer.parseInt(reader.nextLine());
			System.out.println("Type the second number:");
			int secondNumber = Integer.parseInt(reader.nextLine());

			if (firstNumber > secondNumber) {
				System.out.println("Greater number: " + firstNumber);
			} else if (secondNumber > firstNumber) {
				System.out.println("Greater number: " + secondNumber);
			} else {
				System.out.println("The numbers are equal!");
			}
		}
	}
}
