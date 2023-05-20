package com.jbd.dateandtimeapi;

import java.time.LocalDateTime;

public class LocalDateTimeEx2 {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.of(1993, 02, 04, 11, 19);
		System.out.println(dt);

		System.out.println("After six months : " + dt.plusMonths(6));
		System.out.println("Before six months : " + dt.minusMonths(6));
	}
}
