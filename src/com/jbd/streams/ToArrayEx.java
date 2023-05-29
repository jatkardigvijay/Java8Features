package com.jbd.streams;

import java.util.ArrayList;

public class ToArrayEx {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(15);
		al.add(25);
		al.add(0);
		al.add(20);

		Integer[] array = al.stream().toArray(Integer[]::new);
		for (Integer i : array) {
			System.out.println(i);
		}
	}
}
