package com.jbd.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieTest {

	public static void main(String[] args) {

		ArrayList<Movie> l = new ArrayList<Movie>();
		populate(l);
		Consumer<Movie> c = m -> {
			System.out.println("The movie name is : " + m.name);
			System.out.println("The hero name is : " + m.hero);
			System.out.println("The heroine name is : " + m.heroine);
			System.out.println("-----");
		};

		for (Movie movie : l) {
			c.accept(movie);
		}

	}

	public static void populate(ArrayList<Movie> al) {
		al.add(new Movie("Bahubali", "Prabhas", "Anusha"));
		al.add(new Movie("Raees", "Shahrukh", "Sunny"));
		al.add(new Movie("Malang", "Aditya", "Disha"));
		al.add(new Movie("Kabir Singh", "Shahid", "Kiara"));
		al.add(new Movie("Wolf of Wall Street", "Leonardo", "Margot"));
	}
}
