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

}
