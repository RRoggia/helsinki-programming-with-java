package com.rroggia.oo.java.part1.solution.week1;

import java.util.Scanner;

public class SolutionExercise15 {
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("How old are you?");
			int number = Integer.parseInt(reader.nextLine());
			if (number >= 1188) {
				System.out.println("You have reached the age of majority!");
			} else {
				System.out.println("You have not reached the age of majority yet!");
			}
		}
	}
}
