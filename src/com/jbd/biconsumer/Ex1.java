package com.jbd.biconsumer;

import java.util.function.BiConsumer;

public class Ex1 {

	public static void main(String[] args) {

		BiConsumer<String, String> bf = (s1, s2) -> {
			String s3 = s1.concat(s2);
			System.out.println(s3);
		};
		bf.accept("abc", "def");
	}
}
