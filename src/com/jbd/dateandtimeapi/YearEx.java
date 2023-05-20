package com.jbd.dateandtimeapi;

import java.time.Year;
import java.util.Scanner;

public class YearEx {

	public static void main(String[] args) {

		int year;
		System.out.println("Enter an year to check whether leap or not : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		sc.close();

		Year y = Year.of(year);
		if (y.isLeap()) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}
}
