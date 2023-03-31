package com.jbd.binaryoperator;

import java.util.function.IntBinaryOperator;

public class IntBinaryEx {

	public static void main(String[] args) {

		IntBinaryOperator ibo = (num1, num2) -> num1 + num2;
		System.out.println(ibo.applyAsInt(5, 6));
	}
}
