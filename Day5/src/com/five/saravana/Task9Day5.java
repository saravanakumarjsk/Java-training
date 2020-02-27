package com.five.saravana;

import java.util.*;

public class Task9Day5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = 0;
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		while (a > 0) {
			a = a - 1;
			b = b + 1;
			p++;
			if (b == 25) {
				if (a < 0) {
					break;
				}
				a = a + 20;
				b = 0;
			}
			a = a - 1;
			c = c + 1;
			p++;
			if (c == 120) {
				if (a < 0) {
					break;
				}
				a = a + 80;
				c = 0;
			}
			a = a - 1;
			d = d + 1;
			p++;
			if (d == 12) {
				if (a < 0) {
					break;
				}
				a = a + 8;
				d = 0;
			}
		}
		System.out.println("peter plays " + (p - 1) + " times before going broke");

	}

}
