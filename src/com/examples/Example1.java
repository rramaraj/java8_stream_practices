package com.examples;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {

		System.out.println("Example 1:------------");
		IntStream
			.range(0, 10)
			.filter(x -> x%2==0)
			.forEach(x -> System.out.println(x));
		
		System.out.println("Example 2:------------");
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
		
		empList.stream()
			.limit(5)
			.forEach(System.out::println);
		System.out.println();
		
		System.out.println(empList.stream().count());
		System.out.println();
		
		empList.stream()
			.collect(Collectors.toList())
			.forEach(System.out::println);
		System.out.println();
		
		//generate() - Generate the infinite stream 
		Stream.generate(new Random()::nextInt)
			.limit(5)
	    	.forEach(System.out::println);
		System.out.println();

		//map() - Convert stream from one datatype to another
		empList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);
		
		
		System.out.println();
		
		//Difference between sequential and parallel processing using Streams 
		LocalDateTime t1 = LocalDateTime.now();
		System.out.println("Time 1: " + t1);
		System.out.println(LongStream.range(0, 10000000000L).parallel().average());
		LocalDateTime t2 = LocalDateTime.now();
		System.out.println("Time 2: " + t2);
		
		System.out.println("Difference in seconds : " + ChronoUnit.SECONDS.between(t1, t2));
		
		System.out.println(LongStream.range(0, 10000000000L).average());
		LocalDateTime t3 = LocalDateTime.now();
		System.out.println("Time 3: " + t3);
		System.out.println("Difference in seconds : " + ChronoUnit.SECONDS.between(t2, t3));
		
		LocalDateTime bd = LocalDateTime.of(1979, 10, 5, 5, 0);
		System.out.println("Number of days from birthday : " + ChronoUnit.DAYS.between(bd, LocalDateTime.now()));
		
		
	}

}
