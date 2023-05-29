package com.jbd.primitivefunctionalinterface;

import java.util.function.IntFunction;

public class IntFunctionEx {

	public static void main(String[] args) {

		IntFunction<Integer> iff = num -> num * num;

		System.out.println("the square using INT FUNCTION interface is : " + iff.apply(8));
	}
}
