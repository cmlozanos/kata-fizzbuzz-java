package com.example.katafizzbuzzjava;

public class KataFizzBuzzJavaApplication {

	public static void main(final String[] args) {
		System.out.println("Hello Kata");
	}

	public String transform(final Integer number) {
		if ((3 % number) == 0) {
			return "Fizz";
		}
		if ((5 % number) == 0) {
			return "Buzz";
		}
		if ((15 % number) == 0) {
			return "FizzBuzz";
		}
		return number.toString();
	}
}
