package com.fbd.dateandtimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodEx {

	public static void main(String[] args) {

		LocalDate birthDate = LocalDate.of(1965, Month.NOVEMBER, 02);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthDate, today);
		System.out.println("Your age is : " + p.getYears() + " years and " + p.getMonths() + " months" + " and "
				+ p.getDays() + " days");

		LocalDate deathday = LocalDate.of(1965 + 80, Month.JUNE, 04);
		Period p1 = Period.between(today, deathday);
		int d = p1.getYears() * 365 + p1.getMonths() * 30 + p1.getDays();

		System.out.println(
				"You will be on earth till only " + d + " days. Hurry up, you have to do more important things");
	}
}
