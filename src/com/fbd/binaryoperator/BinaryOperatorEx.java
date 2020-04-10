package com.fbd.binaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorEx {

	public static void main(String[] args) {

		BinaryOperator<String> s = (s1, s2) -> s1 + s2;

		System.out.println(s.apply("abc", "def"));
	}
}
