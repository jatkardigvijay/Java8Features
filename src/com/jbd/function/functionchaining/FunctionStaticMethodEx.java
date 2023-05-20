package com.jbd.function.functionchaining;

import java.util.function.Function;

public class FunctionStaticMethodEx {

	public static void main(String[] args) {

		Function<String, String> f = Function.identity();
		System.out.println(f.apply("durga"));
	}
}
