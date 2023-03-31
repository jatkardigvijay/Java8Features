package com.fbd.predicate.softenggpub;

import java.util.function.Predicate;

public class PredicateSoftEnggTest {

	public static void main(String[] args) {

		SoftwareEngineer[] list = { new SoftwareEngineer("durga", 60, false), new SoftwareEngineer("dj", 27, true),
				new SoftwareEngineer("amey", 16, false), new SoftwareEngineer("anish", 21, true),
				new SoftwareEngineer("dinesh", 15, true) };

		Predicate<SoftwareEngineer> allowed = se -> se.age >= 18 && se.isHavingGf == true;

		for (SoftwareEngineer se : list) {
			if (allowed.test(se)) {
				System.out.println(se+" allowed in ZALEB");
			}

		}
	}
}
