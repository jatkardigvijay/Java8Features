package com.jbd.predicate.isequalmethod;

public class Employee {

	String name;
	String designation;
	double salary;
	String city;

	public Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		String s = String.format("%s,%s,%.2f,%s", name, designation, salary, city);
		return s;
	}

}
