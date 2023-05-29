package com.jbd.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryEx1 {

	public static void main(String[] args) {

		UnaryOperator<Integer> uo = num -> num * num;
		System.out.println(uo.apply(10));
	}
}
