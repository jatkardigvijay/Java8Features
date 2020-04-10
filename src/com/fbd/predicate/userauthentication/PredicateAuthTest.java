package com.fbd.predicate.userauthentication;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateAuthTest {

	public static void main(String[] args) {
		
		Predicate<User> p = user -> user.username.equals("dj") && user.pwd.equals("dj");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String username = sc.nextLine();
		System.out.println("Enter Password : ");
		String password = sc.nextLine();
		sc.close();
		User user = new User(username,password);
		if (p.test(user)) {
			System.out.println("Valid user");
		}
		else {
			System.out.println("Enter the correct values");
		}
	}
}
