package com.example.katafizzbuzzjava.rules;

public class FizzBuzzRule implements RulesInterface {

	@Override
	public boolean condition(final Integer number) {
		return (number % 15) == 0;
	}

	@Override
	public String apply(final Integer number) {
		return "FizzBuzz";
	}

}
