package com.jbd.primitivefunctionalinterface;

import java.util.function.ToIntFunction;

public class StringFunctionToIntEx {

	public static void main(String[] args) {

		ToIntFunction<String> tif = s -> s.length();
		System.out.println("Length is : " + tif.applyAsInt("digvijay"));
	}
}
