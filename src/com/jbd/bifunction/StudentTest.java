package com.jbd.bifunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class StudentTest {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		BiFunction<String, Integer, Student> bf = (name, rollno) -> new Student(name, rollno);

		al.add(bf.apply("Digvijay", 101));
		al.add(bf.apply("Akshay", 102));
		al.add(bf.apply("Ramesh", 103));

		for (Student student : al) {
			System.out.println("Roll Number is : " + student.rollno);
			System.out.println("Name is : " + student.name);
			System.out.println("=====");
		}

	}
}
