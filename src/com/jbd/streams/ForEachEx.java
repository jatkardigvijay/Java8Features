package com.jbd.streams;

import java.util.ArrayList;

public class ForEachEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("BBB");
		al.add("CCC");

		// use of forEach
		al.stream().forEach(s -> System.out.println(s));

		// above lambda exp in foreach method can be also written as ::
		System.out.println("below is using :: operator");
		al.stream().forEach(System.out::println);
	}

}
