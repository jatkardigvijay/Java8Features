package com.jbd.predicate.isequalmethod;

import java.util.function.Predicate;

public class isEqualMethodEx {

	public static void main(String[] args) {

		Predicate<String> p = Predicate.isEqual("durgasoft");
		System.out.println(p.test("durgasoft"));
		System.out.println(p.test("mallika"));

	}
}
