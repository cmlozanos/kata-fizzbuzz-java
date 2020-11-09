package com.example.katafizzbuzzjava.rules;

public class BuzzRule implements RulesInterface {

	@Override
	public boolean condition(final Integer number) {
		return (number % 5) == 0;
	}

	@Override
	public String apply(final Integer number) {
		return "Buzz";
	}

}
