package com.example.katafizzbuzzjava.rules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzRuleTest {

	@Test
	public void givenFizzBuzzRuleWhenNumberIsDivisibleBy5AndIsDivisibleBy3ThenShouldReturnTrue() {
		// given
		final FizzBuzzRule rule = new FizzBuzzRule();
		final Integer number = 15;

		// when
		final boolean result = rule.condition(number);

		// then
		Assertions.assertTrue(result);
	}

	@Test
	public void givenFizzBuzzRuleWhenNumberIsNotDivisibleBy5AndIsNotDivisibleBy3ThenShouldReturnFalse() {
		// given
		final FizzBuzzRule rule = new FizzBuzzRule();
		final Integer number = 3;

		// when
		final boolean result = rule.condition(number);

		// then
		Assertions.assertFalse(result);
	}
}
