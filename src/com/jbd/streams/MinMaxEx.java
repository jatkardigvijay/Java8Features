package com.jbd.streams;

import java.util.ArrayList;

public class MinMaxEx {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(10);
		al.add(5);
		al.add(20);
		al.add(15);
		al.add(25);

		System.out.println("Normal printing : " + al);

		Integer min = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("The minimum value is : " + min);

		Integer max = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("The maximum value is : " + max);

		// can get max in this way also
		Integer max1 = al.stream().max(Integer::compare).get();
		System.out.println("The maximum value is : " + max1);
	}
}
