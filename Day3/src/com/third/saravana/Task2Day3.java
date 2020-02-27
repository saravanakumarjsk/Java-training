package com.third.saravana;

import java.util.Scanner;

public class Task2Day3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		// String name = input.nextLine();
		// char gen = input.next().toLowerCase().charAt(0);
		int age = input.nextInt();

		if (age < 18 || age > 60) {
			System.out.printf("not allowed");
		} else {
			System.out.printf("allowed");
		}

	}
}
