package com.fbd.consumerprimitive;

import java.util.function.IntConsumer;

public class IntConsumerEx {

	public static void main(String[] args) {

		IntConsumer ic = num -> System.out.println("the square is : " + (num * num));
		ic.accept(14);
		
		/*
		 * here no internal autoboxing and autounboxing required, and hence the
		 * performance is improvesd
		 */
	}
}
