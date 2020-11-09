package com.example.katafizzbuzzjava;

import com.example.katafizzbuzzjava.rules.RulesEngine;

public class KataFizzBuzzJavaApplication {

	private final RulesEngine rulesEngine = new RulesEngine();

	public static void main(final String[] args) {
		System.out.println("Hello Kata");
	}

	public String transform(final Integer number) {
		return this.rulesEngine.executeRules(number);
	}
}
