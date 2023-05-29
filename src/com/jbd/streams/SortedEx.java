package com.jbd.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEx {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(15);
		al.add(10);
		al.add(5);
		al.add(20);
		al.add(25);

		System.out.println("Normal printing : " + al);

		List<Integer> al1 = al.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorting order : " + al1);

		System.out.println("Descending Order : ");
		List<Integer> al2 = al.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(al2);
	}
}
