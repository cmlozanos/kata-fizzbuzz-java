package com.example.katafizzbuzzjava.rules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuzzRuleTest {

	@Test
	public void givenBuzzRuleWhenNumberIsDivisibleBy5ThenShouldReturnTrue() {
		// given
		final BuzzRule rule = new BuzzRule();
		final Integer number = 5;

		// when
		final boolean result = rule.condition(number);

		// then
		Assertions.assertTrue(result);
	}

	@Test
	public void givenBuzzRuleWhenNumberIsNotDivisibleBy5ThenShouldReturnFalse() {
		// given
		final BuzzRule rule = new BuzzRule();
		final Integer number = 3;

		// when
		final boolean result = rule.condition(number);

		// then
		Assertions.assertFalse(result);
	}

	@Test
	public void givenBuzzRuleWhenApplyThenShouldReturnBuzz() {
		// given
		final BuzzRule rule = new BuzzRule();

		// when
		final String result = rule.apply();

		// then
		Assertions.assertEquals("Buzz", result);
	}

}
