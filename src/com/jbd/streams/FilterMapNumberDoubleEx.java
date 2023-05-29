package com.jbd.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapNumberDoubleEx {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);

		// using normal collection
		List<Integer> al1 = new ArrayList<Integer>();
		for (Integer i : al) {
			al1.add(i * 2);
		}
		System.out.println(al1);

		// using Streams
		List<Integer> al2 = al.stream().map(I -> I * 2).collect(Collectors.toList());
		System.out.println(al2);

	}
}
