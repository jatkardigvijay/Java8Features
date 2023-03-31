package com.jbd.consumerprimitive;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {

		// using normal consumer
		Consumer<Integer> i = num -> System.out.println(num * num);
		i.accept(5);

		// using Int consumer, we dont have to put argument, which in turns saves
		// autoboxing and unboxing
		IntConsumer i1 = num -> System.out.println(num * num);
		i1.accept(11);
	}
}
