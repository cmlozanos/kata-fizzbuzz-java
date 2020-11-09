package com.example.katafizzbuzzjava.rules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RulesEngineTest {

	@Test
	public void givenRuleEngineAndNumber3WhenExecuteRulesThenShouldCheckConditionsAndApplyProperly() {
		// given
		final RulesEngine rulesEngine = new RulesEngine();
		final Integer number = 3;

		// when
		final String result = rulesEngine.executeRules(number);

		// then
		Assertions.assertEquals("Fizz", result);
	}

	@Test
	public void givenRuleEngineAndNumber5WhenExecuteRulesThenShouldCheckConditionsAndApplyProperly() {
		// given
		final RulesEngine rulesEngine = new RulesEngine();
		final Integer number = 5;

		// when
		final String result = rulesEngine.executeRules(number);

		// then
		Assertions.assertEquals("Buzz", result);
	}

	@Test
	public void givenRuleEngineAndNumber15WhenExecuteRulesThenShouldCheckConditionsAndApplyProperly() {
		// given
		final RulesEngine rulesEngine = new RulesEngine();
		final Integer number = 15;

		// when
		final String result = rulesEngine.executeRules(number);

		// then
		Assertions.assertEquals("FizzBuzz", result);
	}
}
