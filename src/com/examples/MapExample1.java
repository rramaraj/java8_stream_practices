package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//A List of Strings to Uppercase
public class MapExample1 {

	public static void main(String[] args) {
		String[] str = {
				"Mohammed Ismail",
				"Ramaraj Ramasamy",
				"Joseph Albert",
				"Neeru Rani",
				"Kemi Raikkonen"
		};
		
		List<String> strL = Arrays.asList(str);
		
		strL.stream()
			.map(toUpper::apply)
			.sorted()
			.forEach(System.out::println);;
		
	}
	
	static Function<String, String> toUpper = (x) -> {
		return x.toUpperCase();
	};

}
