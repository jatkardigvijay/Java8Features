package com.jbd.methodandconstructorrefusingdoublecolonoperator;

public class MethodReferenceTest {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}

	}

	public static void main(String[] args) {

		MethodReferenceTest mrt = new MethodReferenceTest();
		Runnable r = mrt::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread ");
		}
	}
}
