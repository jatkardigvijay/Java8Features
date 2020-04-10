package com.fbd.consumer.primitive;

import java.util.function.ObjDoubleConsumer;

public class UsingObjDoubleConsumer {

	public static void main(String[] args) {

		ObjDoubleConsumer<Employee> odc = (e, d) -> e.salary = e.salary + d;
		Employee e = new Employee("digvijay", 1500);
		odc.accept(e, 5200.0);
		System.out.println(e);
	}
}
