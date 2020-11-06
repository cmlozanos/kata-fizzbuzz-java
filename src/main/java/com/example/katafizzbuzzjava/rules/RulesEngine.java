package com.example.katafizzbuzzjava.rules;

import java.util.ArrayList;
import java.util.Optional;

public class RulesEngine {

	private final ArrayList<RulesInterface> rules;

	RulesEngine() {
		this.rules = new ArrayList<RulesInterface>();
		this.rules.add(new FizzRule());
	}

	public String executeRules(final Integer number) {
		final Optional<String> result = Optional
				.of(this.rules.stream().filter(rule -> rule.condition(number)).findFirst().get().apply());
		return result.isPresent() ? result.get() : null;
	}

}
