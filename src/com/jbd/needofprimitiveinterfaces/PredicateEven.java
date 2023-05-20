package com.jbd.needofprimitiveinterfaces;

import java.util.function.Predicate;

public class PredicateEven {

	public static void main(String[] args) {
		int[] x = { 0, 5, 10, 15, 20, 25 };
		Predicate<Integer> p = (num1) -> num1 % 2 == 0;

		for (int x1 : x) {
			if (p.test(x1)) {
				System.out.println(x1);
			}
		}

	}
}
