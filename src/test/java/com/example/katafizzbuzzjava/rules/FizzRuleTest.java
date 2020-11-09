package com.example.katafizzbuzzjava.rules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzRuleTest {

	@Test
	public void givenFizzRuleWhenNumberIsDivisibleBy3ThenShouldReturnTrue() {
		// given
		final FizzRule rule = new FizzRule();
		final Integer number = 3;

		// when
		final boolean result = rule.condition(number);

		// then
		Assertions.assertTrue(result);
	}

	@Test
	public void givenFizzRuleWhenNumberIsNotDivisibleBy3ThenShouldReturnFalse() {
		// given
		final FizzRule rule = new FizzRule();
		final Integer number = 10;

		// when
		final boolean result = rule.condition(number);

		// then
		Assertions.assertFalse(result);
	}

	@Test
	public void givenFizzRuleWhenApplyThenShouldReturnFizz() {
		// given
		final FizzRule rule = new FizzRule();
		final Integer number = null;

		// when
		final String result = rule.apply(number);

		// then
		Assertions.assertEquals("Fizz", result);
	}
}
