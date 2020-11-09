package com.example.katafizzbuzzjava.rules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DefaultRuleTest {

	@Test
	public void givenDefaultRuleWhenCheckConditionThenShouldReturnTrueAllways() {
		// given
		final DefaultRule rule = new DefaultRule();
		final Integer number = null;

		// when
		final boolean result = rule.condition(number);

		// then
		Assertions.assertTrue(result);
	}

	@Test
	public void givenDefaultRuleWhenApplyThenShouldReturnSameNumberAsString() {
		// given
		final DefaultRule rule = new DefaultRule();
		final Integer number = 1;

		// when
		final String result = rule.apply(number);

		// then
		Assertions.assertEquals("1", result);
	}
}
