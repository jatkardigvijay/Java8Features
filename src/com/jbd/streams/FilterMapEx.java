package com.jbd.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapEx {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(0);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);

		System.out.println(al);

		System.out.println();

		System.out.println("Even number print : ");

		/*
		 * List<Integer> al1 = new ArrayList<Integer>(); for (Integer integer : al) { if
		 * (integer % 2 == 0) { al1.add(integer); } } System.out.println(al1); above
		 * logic was for print even nos using 1.7 java version
		 */

		// below is streams used of 1.8 version
		List<Integer> al1 = al.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(al1);
	}
}
