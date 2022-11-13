package com.examples;

import java.util.stream.Stream;

public class IterateExample1 {

	public static void main(String[] args) {

		Stream.iterate(2L, 
				(Long x) -> x*x)
			.limit(10)
			.forEach(System.out::println);
	}

}
