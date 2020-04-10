package com.fbd.primitivefunctionalinterface;

import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {

		Function<Integer, Integer> f = num -> num * num;

		System.out.println("The Square of the number is : " + f.apply(5));
	}

}
