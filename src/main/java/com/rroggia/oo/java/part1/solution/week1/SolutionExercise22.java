package com.rroggia.oo.java.part1.solution.week1;

import java.util.Scanner;

public class SolutionExercise22 {
	public static void main(String[] args) {
		String password = "carrot";

		try (Scanner reader = new Scanner(System.in)) {
			while (true) {
				System.out.println("Type the password:");
				String inputPassword = reader.nextLine();

				if (password.equals(inputPassword)) {
					System.out.println("Right!");
					break;
				}
				System.out.println("Wrong!");
			}
		}

		System.out.println("The secret is: jryy qbar!");
	}
}
