package com.jbd.primitivefunctionalinterface;

import java.util.function.IntToDoubleFunction;

public class ToDoubleFunctionEx {

	public static void main(String[] args) {

		IntToDoubleFunction f = num -> Math.sqrt(num);

		System.out.println("The Square of is : " + f.applyAsDouble(25));
	}
	
}
