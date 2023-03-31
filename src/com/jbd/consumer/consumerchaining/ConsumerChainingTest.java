package com.jbd.consumer.consumerchaining;

import java.util.function.Consumer;

public class ConsumerChainingTest {

	public static void main(String[] args) {

		Consumer<Movie> c1 = m -> System.out.println("Movie " + m.name + " was released");
		Consumer<Movie> c2 = m -> System.out.println("The movie was a : " + m.result);
		Consumer<Movie> c3 = m -> System.out.println("Movie " + m.name + " storing in database");

		Consumer<Movie> chainedC = c1.andThen(c2).andThen(c3);

		Movie m = new Movie("Bahubali", "hit");
		chainedC.accept(m);
	}
}
