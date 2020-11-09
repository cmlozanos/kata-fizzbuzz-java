package com.example.katafizzbuzzjava.rules;

public class FizzRule implements RulesInterface {

	@Override
	public boolean condition(final Integer number) {
		return (number % 3) == 0;
	}

	@Override
	public String apply() {
		return "Fizz";
	}

}
