package com.fbd.consumerprimitive;

import java.util.function.LongConsumer;

public class LongConsumerEx {

	public static void main(String[] args) {

		LongConsumer lc = num -> System.out.println("My mobile number is : " + num);
		lc.accept(0);
	}
}
