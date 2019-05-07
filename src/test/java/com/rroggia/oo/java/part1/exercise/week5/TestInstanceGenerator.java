package com.rroggia.oo.java.part1.exercise.week5;

import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestInstanceGenerator {

	public static <T> Constructor<T> getConstructor(Class<T> implementationClass, Class<?>... parameterType) {

		try {
			return implementationClass.getConstructor(parameterType);

		} catch (NoSuchMethodException e) {
			fail("Missing constructor implementation.");
			throw new RuntimeException(e);

		} catch (SecurityException | IllegalArgumentException e) {
			throw new RuntimeException();
		}
	}

	public static <T> T getInstanceOfClass(Class<T> implementationClass, Constructor<T> constructor,
			Object... arguments) {

		try {
			Object newInstance = constructor.newInstance(arguments);
			return implementationClass.cast(newInstance);

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			fail("Excpetion while invoking method or constructor. " + e.getTargetException().getMessage());
			throw new RuntimeException(e);
		}
	}

}
