package com.jbd.predicate.softenggpub;

public class SoftwareEngineer {

	String name;
	int age;
	boolean isHavingGf;

	SoftwareEngineer(String name, int age, boolean isHavingGf) {
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}

	@Override
	public String toString() {
		return name;
	}

}
