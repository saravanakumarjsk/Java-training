package com.third.saravana;

import java.util.*;

public class ConditionalStmtDay3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		char gen = input.next().toLowerCase().charAt(0);
		int age = input.nextInt();

		if (age >= 18 && (gen == 'M'|| gen=='m')) {
			System.out.printf("Welcome %s you can vote at male section", name);
		} else if (age >= 18 && (gen == 'F'||gen=='f')) {
			System.out.printf("Welcome %s you can vote at female section", name);
		} else {
			System.out.printf("Not elligble");
		}
	}
}
