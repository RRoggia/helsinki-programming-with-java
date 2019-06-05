package com.rroggia.oo.java.part1.exercise.week1;

import com.rroggia.oo.java.ExercisePath;
import com.rroggia.oo.java.part1.solution.week1.SolutionExercise5Test;

public class Exercise5Test extends SolutionExercise5Test {
	@Override
	protected Class<?> determineImplementationClass() throws ClassNotFoundException {
		return Class.forName(ExercisePath.course().part1().week1().getPath("Exercise5"));
	}
}
