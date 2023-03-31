package com.fbd.methodandconstructorrefusingdoublecolonoperator.constructerref;

public class Test {

	public static void main(String[] args) {

		// used constructor reference
		Intref i = Sample::new;
		Sample s = i.get();
	}
}
