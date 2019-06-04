package com.rroggia.oo.java;

public class ExercisePath {
	private final static String PROJECT_PREFIX = "com.rroggia.oo.java";
	private final static String COURSE_PART1_PREFIX = "part1";
	private final static String EXERCISE_PACKAGE_PREFIX = "exercise";
	private final static String WEEK1_PREFIX = "week1";

	private String path = PROJECT_PREFIX;

	private ExercisePath() {
	}

	public static ExercisePath course() {
		return new ExercisePath();
	}

	public ExercisePath part1() {
		path += dotSeparator(COURSE_PART1_PREFIX);
		return this;
	}

	public ExercisePath week1() {
		path = exercise() + dotSeparator(WEEK1_PREFIX);
		return this;
	}

	public String getPath(String exercise) {
		return path += dotSeparator(exercise);
	}

	public String getPath() {
		return path;
	}

	private String exercise() {
		path += dotSeparator(EXERCISE_PACKAGE_PREFIX);
		return path;
	}

	private String dotSeparator(String packageName) {
		return "." + packageName;
	}

}
