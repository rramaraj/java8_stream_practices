package com.examples;

import java.util.Arrays;
import java.util.List;

//Example for Filter, Distinct, Limit, Skip
public class FilterExample1 {

	public static void main(String[] args) {
		System.out.println();
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
		
		//Filter the names starts with 
		System.out.println("Names starts with the letter 't' or 'T'");
		nl.stream()
			.filter(s -> s.toLowerCase().startsWith("t"))
			.forEach(System.out::println);
		System.out.println();
		
		//Duplicate names are removed
		System.out.println("Duplicate names are removed.");
		nl.stream()
			.filter(s -> s.toLowerCase().startsWith("t"))
			.distinct()
			.forEach(System.out::println);
		System.out.println();
		
		//Limit to 4 values
		System.out.println("Limit to 4 values from the original stream.");
		nl.stream()
			.limit(4)
			.forEach(System.out::println);
		System.out.println();
		
		//Skip the first 5 values
		System.out.println("Skip the first 5 values from the original stream.");
		nl.stream()
			.skip(5)
			.forEach(System.out::println);
		System.out.println();
		
	}

}
