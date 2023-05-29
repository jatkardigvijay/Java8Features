package com.jbd.supplier;

import java.util.function.Supplier;

public class SupplierRandomNameEx {

	public static void main(String[] args) {

		Supplier<String> s = () -> {
			String[] s1 = { "Nhinny", "Bunny", "Chinny", "Sunny","Ramesh" };

			int x = (int) (Math.random()*5);

			return s1[x];

		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
