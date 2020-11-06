package com.example.katafizzbuzzjava.rules;

public class FizzRule implements RulesInterface {

	@Override
	public boolean condition(final Integer number) {
		return (3 % number) == 0;
	}

	@Override
	public String apply() {
		return "Fizz";
	}

}
