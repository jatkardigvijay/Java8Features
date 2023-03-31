package com.fbd.function.functionchaining;

import java.util.function.Function;

public class DiffBetwnAndThenandCompose {

	public static void main(String[] args) {

		Function<Integer, Integer> f1 = i -> i + i;
		Function<Integer, Integer> f2 = i -> i * i * i;
		
		//demo diff between f1 and f2

		// in andThen, first operation of f1 and then f2
		System.out.println(f1.andThen(f2).apply(2));

		// first f2 operation and then f1 operation
		System.out.println(f1.compose(f2).apply(2));
	}
}
