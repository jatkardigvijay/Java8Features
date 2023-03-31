package com.jbd.consumer.primitive;

import java.util.function.BiConsumer;

public class UsingNormalBiconsumerEx {

	public static void main(String[] args) {

		BiConsumer<Employee, Double> bc = (e, d) -> e.salary = e.salary + d;
		Employee e = new Employee("digvijay", 19000);
		// System.out.println(bc.accept(e, 5000.0));

		bc.accept(e, 5000.0);
		System.out.println(e);
	}
}
