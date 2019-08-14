package com.rroggia.oo.java.part1.solution.week1.exercise23;

import java.util.Scanner;

public class SolutionExercise23 {
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in);) {

			while (true) {
				System.out.println("Type a temperature:");
				double temperature = Double.parseDouble(reader.nextLine());

				if (temperature >= -30 && temperature <= 40) {
					Graph.addNumber(temperature);
				} else {
					System.out.println("Temperature must be between -30 and 40 degrees.");
				}
			}
		}
	}

}
