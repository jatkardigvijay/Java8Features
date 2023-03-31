package com.fbd.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Shahrukh");
		al.add("Hritik Roshan");
		al.add("Salman Khan");
		al.add("Amir Khan");
		al.add("Tiger");

		List<String> al2 = al.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(al2);
	}
}
