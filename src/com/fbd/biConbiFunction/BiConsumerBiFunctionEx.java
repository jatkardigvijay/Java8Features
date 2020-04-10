package com.fbd.biConbiFunction;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiConsumerBiFunctionEx {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		BiFunction<String, Double, Employee> bf = (name, salary) -> new Employee(name, salary);

		al.add(bf.apply("Durga", 1500.0));
		al.add(bf.apply("dj", 5500.0));
		al.add(bf.apply("AJ", 8500.0));
		al.add(bf.apply("MJ", 6500.0));

		BiConsumer<Employee, Double> bc = (e, d) -> e.salary = e.salary + d;

		for (Employee employee : al) {
			bc.accept(employee, 500.0);
		}
		BiConsumer<Employee, Double> bc1 = (ee, dd) -> {
			System.out.println("Employee name : " + ee.name);
			System.out.println("Employee salary : " + ee.salary);
			System.out.println("-----");
		};
		for (Employee employee : al) {
			bc1.accept(employee, 500.0);
		}
	}
}
