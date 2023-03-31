package com.jbd.consumer.primitive;

public class Employee {

	String name;
	double salary;

	public Employee(String name, double salary) {

		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary + "";
	}

}
