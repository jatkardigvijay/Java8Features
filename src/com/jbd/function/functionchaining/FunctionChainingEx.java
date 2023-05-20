package com.jbd.function.functionchaining;

import java.util.function.Function;

public class FunctionChainingEx {

	public static void main(String[] args) {

		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 9);
		System.out.println("The result of f1:" + f1.apply("AishwaryaAbhi"));
		System.out.println("The result of f2:" + f2.apply("AishwaryaAbhi"));
		System.out.println("Apply f1 and f2:" + f1.andThen(f2).apply("AishwaryaAbhi"));
		System.out.println("Compose f1 and f2:" + f1.compose(f2).apply("AishwaryaAbhi"));
	}
}
