package com.rroggia.oo.java.part1.exercise.week1;

import com.rroggia.oo.java.ExercisePath;
import com.rroggia.oo.java.part1.solution.week1.SolutionExercise3Test;

public class Exercise3Test extends SolutionExercise3Test {

	@Override
	protected Class<?> determineImplementationClass() throws ClassNotFoundException {
		return Class.forName(ExercisePath.course().part1().week1().getPath("Exercise3"));
	}
}
