package com.jbd.primitivefunctionalinterface;

import java.util.function.IntPredicate;

public class IntPrefdicateEx {

	public static void main(String[] args) {

		int[] x = { 0, 5, 10, 15, 20, 25 };
		IntPredicate ip = num -> num % 2 == 0;

		for (int x1 : x) {
			if (ip.test(x1)) {
				System.out.println(x1);
			}
		}
	}
}
