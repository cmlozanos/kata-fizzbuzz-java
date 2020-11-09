package com.example.katafizzbuzzjava.rules;

public class DefaultRule implements RulesInterface {

	@Override
	public boolean condition(final Integer number) {
		return true;
	}

	@Override
	public String apply(final Integer number) {
		return number.toString();
	}

}
