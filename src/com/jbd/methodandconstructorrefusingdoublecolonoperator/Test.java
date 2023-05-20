package com.jbd.methodandconstructorrefusingdoublecolonoperator;

public class Test {

	public static void m2() {
		System.out.println("Method Reference");
		/*
		 * more lines of code is here
		 */
	}

	public static void main(String[] args) {

		Intref i = Test::m2;
		i.m1();
	}
}
