package com.jbd.primitive15function;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionEx {

	public static void main(String[] args) {

		IntToDoubleFunction iit = num -> Math.sqrt(num);
		System.out.println("The square root is : " + iit.applyAsDouble(25));
	}
}
