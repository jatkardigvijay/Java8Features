package com.fbd.streams;

import java.util.ArrayList;

public class CountEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Shahrukh");
		al.add("Hritik Roshan");
		al.add("Salman Khan");
		al.add("Amir Khan");
		al.add("Tiger");

		System.out.println(al);
		
		long count1 = al.stream().filter(s -> s.length() >= 9).count();
		System.out.println("The count of strings with length >= 9 is : " + count1);
	}
}
