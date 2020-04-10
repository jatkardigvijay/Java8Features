package com.fbd.primitive15function;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionEx {

	public static void main(String[] args) {

		ToDoubleFunction<Integer> tdf = num -> Math.sqrt(num);
		System.out.println("The square root is : " + tdf.applyAsDouble(26));
	}
}
