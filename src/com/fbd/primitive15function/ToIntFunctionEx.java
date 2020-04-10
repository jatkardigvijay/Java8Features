package com.fbd.primitive15function;

import java.util.function.ToIntFunction;

public class ToIntFunctionEx {

	public static void main(String[] args) {

		ToIntFunction<String> tif = s -> s.length();
		System.out.println("Length of string is : " + tif.applyAsInt("digvijay"));
	}
}
