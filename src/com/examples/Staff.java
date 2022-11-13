package com.examples;

import java.math.BigDecimal;
import java.util.Objects;

public class Staff {
	String name;
	String age;
	BigDecimal salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}
	public Staff(String name, String age, BigDecimal salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}
