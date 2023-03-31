package com.jbd.bifunction;

import java.util.function.BiFunction;

public class BiFunctionEx1 {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bf = (num1, num2) -> num1 * num2;

		System.out.println(bf.apply(10, 20));

	}
}
