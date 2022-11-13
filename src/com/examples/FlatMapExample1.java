package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Java code for Stream flatMap
//(Function mapper) to get a stream by
//replacing the stream with a mapped
//stream by applying the provided mapping function.
public class FlatMapExample1 {

	public static void main(String[] args) {
		String[] str = {
			"Ramaraj",
			"Ashok",
			"Arutperunjothi",
			"Yuvaraja",
			"Kamadeshwar"
		};
		
		Arrays.asList(str).stream().map(x -> x.charAt(2)).forEach(System.out::println);
		System.out.println();
		
		//Flatmap
		Stream<Character> a = Arrays.asList(str).stream().flatMap(x -> Stream.of(x.charAt(2)));
		a.forEach(System.out::println);
		
	}

}
