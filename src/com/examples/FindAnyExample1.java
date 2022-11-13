package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample1 {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
		    new Employee("Tom Jones", 45),
		    new Employee("Harry Major", 25),
		    new Employee("Ethan Hardy", 65),
		    new Employee("Nancy Smith", 22),
		    new Employee("Deborah Sprightly", 29),
		    new Employee("Billy Kid", 22),
		    new Employee("George King",44),
		    new Employee("Annie Barrey", 19));
	
		    Optional<Employee> anyEmpAbove40 = employeeList.parallelStream()
		                                       .filter(emp -> emp.getAge() > 40)
		                                       .findAny();
		    if(anyEmpAbove40.isPresent()){
		      System.out.println("Any Employee above age 40: " + anyEmpAbove40.get());
		    }
			    
	}

}
