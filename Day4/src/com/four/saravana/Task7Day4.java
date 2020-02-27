package com.four.saravana;

import java.util.*;

public class Task7Day4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int count1 = 0, res;
		int minn = Math.min(year, 2001);
		if (year >= 2001) {
			int count = 1;
			for (int i = 2001; i <= year; i++) {
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
					count1++;
					count += 1;
				} else if (count1 == 1) {
					count1 = 0;
					count += 2;
				} else {
					count += 1;
				}
			}
			res = (count - 1) % 7;
		} else {
			int count = 0;
			for (int i = year; i <= 2001; i++) {
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
					count1++;
					count += 1;
				} else if (count1 == 1) {
					count1 = 0;
					count += 2;
				} else {
					count += 1;
				}

			}
			res = (count) % 7;

		}
		switch (res) {
		case 1:
			if (year >= 2001) {
				System.out.println("Monday");
				break;
			} else {
				System.out.println("Monday");
				break;
			}
		case 2:
			if (year >= 2001) {
				System.out.println("Tuesday");
				break;
			} else {
				System.out.println("Sunday");

				break;
			}
		case 3:
			if (year >= 2001) {
				System.out.println("Wednesday");
				break;
			} else {
				System.out.println("Saturday");

				break;
			}
		case 4:
			if (year >= 2001) {
				System.out.println("Thursday");
				break;
			} else {
				System.out.println("Friday");

				break;
			}
		case 5:
			if (year >= 2001) {
				System.out.println("Friday");
				break;
			} else {
				System.out.println("Thursday");

				break;
			}
		case 6:
			if (year >= 2001) {
				System.out.println("Saturday");
				break;
			} else {
				System.out.println("Wednesday");

				break;
			}
		case 0:
			if (year >= 2001) {
				System.out.println("Sunday");
				break;
			} else {
				System.out.println("Tuesday");

				break;
			}
		default:
			System.out.println("Invalid");
		}
	}
}