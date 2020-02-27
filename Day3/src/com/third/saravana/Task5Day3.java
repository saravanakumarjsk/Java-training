package com.third.saravana;

import java.util.*;

public class Task5Day3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if ((a + b + c == 180) && (a == b)) {
			System.out.println("prize 3");
		} else if ((a + b + c == 180) && ((a == 90) || (b == 90) || (c == 90))) {
			System.out.println("prize 2");
		} else if (a + b + c == 180) {
			System.out.println("prize 1");
		} else {
			System.out.println("no prize");
		}
	}
}
