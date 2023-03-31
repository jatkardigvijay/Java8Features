package com.fbd.unaryoperator;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorEx {

	public static void main(String[] args) {

		IntUnaryOperator iuo = num -> num * num;
		System.out.println(iuo.applyAsInt(10));
	}
}
