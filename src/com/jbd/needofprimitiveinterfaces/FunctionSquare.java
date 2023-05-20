package com.jbd.needofprimitiveinterfaces;

import java.util.function.Function;

public class FunctionSquare {

	public static void main(String[] args) {

		Function<Integer, Integer> f = num -> num * num;

		System.out.println("The square of the number is : " + f.apply(5));

	}
}
