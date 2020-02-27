package com.third.saravana;

import java.util.Scanner;

public class Taks3Day3 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		// String name = input.nextLine();
		// char gen = input.next().toLowerCase().charAt(0);
		int val = input.nextInt();

		if ((val % 10) == 3 || (val % 10) == 8) {
			System.out.printf("Lucky winner");
		} else {
			System.out.printf("Not a Lucky winner");
		}

	}
}
