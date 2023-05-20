package com.jbd.predicate.isequalmethod;

import java.util.function.Predicate;

public class PredicateEx2 {

	public static void main(String[] args) {
		
		Predicate<Employee> p1 = Predicate.isEqual(new Employee("durga", "CEO", 35000, "Pune"));
		
	}
}
