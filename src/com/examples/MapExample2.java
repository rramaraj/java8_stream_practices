package com.examples;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

//List of objects -> List of String
//Get all the name values from a list of the staff objects.

public class MapExample2 {

	public static void main(String[] args) {
		List<Staff> staffs = Arrays.asList(
				new Staff("Ramaraj Ramasamy", "43", new BigDecimal(10000)),
				new Staff("Muthulakshmi Arumugasamy", "39", new BigDecimal(50000)),
				new Staff("Arutperunjothi", "200", new BigDecimal(1000000)),
				new Staff("Ivaraja", "44", new BigDecimal(14000))
				);
		
		staffs.stream().map(s -> s.getName()).forEach(System.out::println);
		
	}

}
