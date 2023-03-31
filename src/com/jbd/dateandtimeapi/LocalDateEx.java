package com.fbd.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateEx {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Today's date is : " + date);
		LocalTime time = LocalTime.now();
		System.out.println("Time right now is : " + time);

		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();

		System.out.println(dd + "..." + mm + "..." + yyyy);
		System.out.printf("%d-%d-%d", dd, mm, yyyy);

		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();

		System.out.printf("%d-%d-%d-%d", h, m, s, n);
	}
}
