package com.third.saravana;

import java.util.*;

public class Task4Day3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char b = input.next().charAt(0);
		int c = input.nextInt();

		char f = input.next().charAt(0);
		int r = input.nextInt();

		char t = input.next().charAt(0);
		int y = input.nextInt();

		if (b == f && f == t && t == b && c == r && r == y && y == c) {
			System.out.println("Double Bonanza");
		} else if ((b == f && f == t && t == b) || (c == r && r == y && y == c)) {
			System.out.println("Bonanza");
		} else {
			System.out.println("No Bonanza");
		}

	}

}
