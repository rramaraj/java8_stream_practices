package com.examples;

import java.time.LocalDateTime;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class GenerateExample1 {

	static Supplier<LocalDateTime> s = () -> {
		return LocalDateTime.now();
	};
	
	public static void main(String[] args) {
		
		Stream.generate(s)
			.limit(10)
			.forEach(System.out::println);
		
	}

}
