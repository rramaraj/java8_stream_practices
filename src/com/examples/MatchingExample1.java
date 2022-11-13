package com.examples;

import java.util.Arrays;
import java.util.List;

public class MatchingExample1 {

	public static void main(String[] args) {
		String[] names = {
				"Annamalai",
				"Ambalavanan",
				"Thiruvarul",
				"Arutperunjothi",
				"Jalakandeswarar",
				"Thiruvarul",
				"Parthasarathi",
				"Thirunavukkarasu",
				"Kamadeswarar",
				"Mahadev"
		};

		List<String> nl = Arrays.asList(names);
		nl.stream().forEach(System.out::println);
		System.out.println("Is all string contains letter a ? ");
		System.out.println(nl.stream().allMatch(s -> s.toLowerCase().contains("a")));
		System.out.println();
		
		System.out.println("Is any string contains letter y ? ");
		System.out.println(nl.stream().anyMatch(s -> s.toLowerCase().contains("y")));
		System.out.println();
		
		System.out.println("Is none of the string contains letter z ? ");
		System.out.println(nl.stream().noneMatch(s -> s.contains("z")));
		System.out.println();
		
	}

}
