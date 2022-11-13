package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample1 {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee("Ramaraj", 42),
				new Employee("Neeru Rani", 27),
				new Employee("Divya", 28),
				new Employee("Rajesh Devakirubai", 49),
				new Employee("Kavitha", 46),
				new Employee("Venu Mandava", 37),
				new Employee("Vignesh", 36),
				new Employee("Gowthaman Surulimalai", 35)
				);

		
		List<String> empNewList = empList.stream()
			.filter(e -> e.getName().length()>10)
			.peek(e -> System.out.println(e.getAge() + " => " + e.getName()))
			.map(e -> e.getName().toUpperCase())
			.peek(e -> System.out.println(e))
			.collect(Collectors.toList());
	}

}
