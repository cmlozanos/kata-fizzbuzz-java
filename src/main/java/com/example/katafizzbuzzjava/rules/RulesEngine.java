package com.example.katafizzbuzzjava.rules;

import java.util.ArrayList;
import java.util.Optional;

public class RulesEngine {

	private final ArrayList<RulesInterface> rules;

	public RulesEngine() {
		this.rules = new ArrayList<>();
		this.rules.add(new FizzBuzzRule());
		this.rules.add(new FizzRule());
		this.rules.add(new BuzzRule());
		this.rules.add(new DefaultRule());
	}

	public String executeRules(final Integer number) {
		if (null == number) {
			throw new IllegalArgumentException();
		}

		final Optional<RulesInterface> findFirst = this.rules.stream().filter(rule -> rule.condition(number))
				.findFirst();
		final RulesInterface rule = findFirst.orElseThrow(IllegalArgumentException::new);
		return rule.apply(number);
	}

}
