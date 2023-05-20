package com.jbd.dateandtimeapi;

import java.time.LocalDateTime;

public class LocalDateTimeEx {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Date and time is : " + ldt);

		int dd = ldt.getDayOfMonth();
		int mm = ldt.getMonthValue();
		int yy = ldt.getYear();

		System.out.printf("date month year is : " + "%d-%d-%d", dd, mm, yy);

		int h = ldt.getHour();
		int m = ldt.getMinute();
		int s = ldt.getSecond();
		int n = ldt.getNano();

		System.out.println();
		System.out.printf("Hour minute second nanosecond is : " + "%d-%d-%d-%d", h, m, s, n);
	}
}
