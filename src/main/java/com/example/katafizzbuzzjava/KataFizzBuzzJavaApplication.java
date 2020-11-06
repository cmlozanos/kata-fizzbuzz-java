package com.example.katafizzbuzzjava;

public class KataFizzBuzzJavaApplication {

	public static void main(final String[] args) {
		System.out.println("Hello Kata");
	}

	public String transform(final Integer number) {
		if (null == number) {
			throw new IllegalArgumentException();
		}

		if (this.isFizz(number)) {
			return "Fizz";
		}
		if (this.isBuzz(number)) {
			return "Buzz";
		}
		if (this.isFizzBuzz(number)) {
			return "FizzBuzz";
		}
		return number.toString();
	}

	private boolean isFizzBuzz(final Integer number) {
		return (15 % number) == 0;
	}

	private boolean isBuzz(final Integer number) {
		return (5 % number) == 0;
	}

	private boolean isFizz(final Integer number) {
		return (3 % number) == 0;
	}
}
