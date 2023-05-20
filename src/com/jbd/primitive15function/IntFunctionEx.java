package com.jbd.primitive15function;

import java.util.function.IntFunction;

public class IntFunctionEx {

	public static void main(String[] args) {

		IntFunction<Integer> f = num -> num * num;
		System.out.println("Square is : " + f.apply(5));
	}
}
