package com.jbd.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Shahrukh");
		al.add("Hritik Roshan");
		al.add("Salman Khan");
		al.add("Amir Khan");
		al.add("Tiger");

		List<String> al2 = al.stream().filter(s -> s.length() >= 9).collect(Collectors.toList());
		System.out.println(al2);

		// collect(): this method collects elements from the stream and adding to the
		// specified collection

	}
}
