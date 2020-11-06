package com.example.katafizzbuzzjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataFizzBuzzJavaApplicationTest {

	@Test
	public void givenNumberDivisibleBy3WhenTransformThenShouldReturnFizz() {
		// given
		final KataFizzBuzzJavaApplication app = new KataFizzBuzzJavaApplication();
		final Integer number = 3;

		// when
		final String result = app.transform(number);

		// then
		Assertions.assertEquals("Fizz", result);
	}

	@Test
	public void givenNumberDivisibleBy5WhenTransformThenShouldReturnBuzz() {
		// given
		final KataFizzBuzzJavaApplication app = new KataFizzBuzzJavaApplication();
		final Integer number = 5;

		// when
		final String result = app.transform(number);

		// then
		Assertions.assertEquals("Buzz", result);
	}

	@Test
	public void givenNumberDivisibleBy3AndDivisibleBy5WhenTransformThenShouldReturnFizzBuzz() {
		// given
		final KataFizzBuzzJavaApplication app = new KataFizzBuzzJavaApplication();
		final Integer number = 15;

		// when
		final String result = app.transform(number);

		// then
		Assertions.assertEquals("FizzBuzz", result);
	}

	@Test
	public void givenNumberNotDivisibleBy3NeitherDivisibleBy5WhenTransformThenShouldReturnNumberAsString() {
		// given
		final KataFizzBuzzJavaApplication app = new KataFizzBuzzJavaApplication();
		final Integer number = 4;

		// when
		final String result = app.transform(number);

		// then
		Assertions.assertEquals("4", result);
	}
}
