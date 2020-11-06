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
	public void givenFizzRuleWhenApplyThenShouldReturnFizz() {
		// given
		final FizzRule rule = new FizzRule();

		// when
		final String result = rule.apply();

		// then
		Assertions.assertEquals("Fizz", result);
	}
}
