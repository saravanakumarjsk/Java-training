package com.four.saravana;

import java.util.*;

public class Task5Day4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int giv = input.nextInt();

		int x1 = input.nextInt();
		int y1 = input.nextInt();

		int x2 = input.nextInt();
		int y2 = input.nextInt();

		int x3 = input.nextInt();
		int y3 = input.nextInt();

		int res1 = ((x2 - x1) * (x2 - x1));
		int res2 = ((y2 - y1) * (y2 - y1));

		int res3 = res1 + res2;

		int res4 = ((x3 - x2) * (x3 - x2));
		int res5 = ((y3 - y2) * (y3 - y2));

		int res6 = res4 + res5;

		int res7 = ((x1 - x3) * (x1 - x3));
		int res8 = ((y1 - y3) * (y1 - y3));

		int res9 = res7 + res8;

		int p1 = (int) Math.sqrt(res3);
		int p2 = (int) Math.sqrt(res6);
		int p3 = (int) Math.sqrt(res9);

		// System.out.println(p1+" "+p2+" "+p3);

		// giv - d1 == 0 && d1 - d2 == 0 && d3 - d1 == 0
		// p2<=giv && (p1<=giv || (p3<=giv)))
		// if(p2<=giv && p1-p2<=giv && p2-p3<=giv && p3-p1<=giv)

		if (p2 <= giv && p1 - p2 <= giv && p2 - p3 <= giv && p3 - p1 <= giv) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
