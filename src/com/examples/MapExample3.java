package com.examples;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//List of objects -> List of other objects
public class MapExample3 {
	public static void main(String[] args) {
		List<Staff> staffs = Arrays.asList(
				new Staff("Ramaraj Ramasamy", "43", new BigDecimal(10000)),
				new Staff("Muthulakshmi Arumugasamy", "39", new BigDecimal(50000)),
				new Staff("Arutperunjothi", "200", new BigDecimal(1000000)),
				new Staff("Ivaraja", "44", new BigDecimal(14000))
				);

		
		List<Employee> empList = staffs.stream().map(s -> {
			Employee e = new Employee(s.getName(), Integer.parseInt(s.getAge()));
			return e;
		}).collect(Collectors.toList());
		
		System.out.println("Staff objects are converted to Employee objects");
		empList.forEach(System.out::println);
	}
}
