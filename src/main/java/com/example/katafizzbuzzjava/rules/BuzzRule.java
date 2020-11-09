package com.example.katafizzbuzzjava.rules;

public class BuzzRule implements RulesInterface {

	@Override
	public boolean condition(final Integer number) {
		return (5 % number) == 0;
	}

	@Override
	public String apply() {
		return "Buzz";
	}

}
