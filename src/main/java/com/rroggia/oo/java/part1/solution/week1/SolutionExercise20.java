package com.rroggia.oo.java.part1.solution.week1;

import java.util.Scanner;

public class SolutionExercise20 {
	public static void main(String[] args) {
		String alexName = "alex";
		String alexPassword = "mightyducks";

		String emilyName = "emily";
		String emilyPassword = "cat";

		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Type your username:");
			String username = reader.nextLine();
			System.out.println("Type your password:");
			String password = reader.nextLine();

			if ((alexName.equals(username) && alexPassword.equals(password))
					|| emilyName.equals(username) && emilyPassword.equals(password)) {
				System.out.println("You are now logged into the system!");
			} else {
				System.out.println("Your username or password was invalid");
			}
		}
	}
}
