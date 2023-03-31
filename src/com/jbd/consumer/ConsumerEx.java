package com.jbd.consumer;

import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hello Digvijay");
		c.accept("DurgaSoft");
	}
}
