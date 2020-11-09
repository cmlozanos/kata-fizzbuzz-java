package com.example.katafizzbuzzjava.rules;

public class FizzBuzzRule implements RulesInterface {

	@Override
	public boolean condition(final Integer number) {
		return (15 % number) == 0;
	}

	@Override
	public String apply() {
		// TODO Auto-generated method stub
		return null;
	}

}
