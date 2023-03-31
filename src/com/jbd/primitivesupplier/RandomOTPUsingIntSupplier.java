package com.fbd.primitivesupplier;

import java.util.function.IntSupplier;

public class RandomOTPUsingIntSupplier {

	public static void main(String[] args) {

		IntSupplier s = () -> (int) (Math.random() * 10);
		String otp = "";
		for (int i = 0; i < 6; i++) {
			otp = otp + s.getAsInt();
		}
		System.out.println(otp);
	}
}
