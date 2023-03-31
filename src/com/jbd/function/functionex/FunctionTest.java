package com.fbd.function.functionex;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {

		//legnth of string
		/*
		 * Function<String, Integer> f = s -> s.length();
		 * System.out.println(f.apply("durga"));
		 * System.out.println(f.apply("digvijay"));
		 */

		//square of a number
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(5));
	}
}
