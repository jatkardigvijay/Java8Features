package com.fbd.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateEx1 {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> bp = (num1, num2) -> (num1 + num2) % 2 == 0;
		System.out.println(bp.test(10, 20));
		System.out.println(bp.test(10, 25));
	}
}
