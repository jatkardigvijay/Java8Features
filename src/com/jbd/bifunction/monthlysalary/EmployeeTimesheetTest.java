package com.jbd.bifunction.monthlysalary;

import java.util.function.BiFunction;

public class EmployeeTimesheetTest {

	public static void main(String[] args) {

		Employee e = new Employee(101, "Durga", 1500);
		TimeSheet t = new TimeSheet(101, 25);

		BiFunction<Employee, TimeSheet, Double> bf = (f, m) -> f.dailyWage * m.days;

		System.out.println("Monthly salary is : " + bf.apply(e, t));

	}
}
