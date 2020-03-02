package com.ten;

import java.util.Scanner;

public class Task2_BestMoblPlan {

	public static void printPlanDetails(int a, int b, int c) {
		float d, e, f;
		if (a <= 100) {
			e = 0;
		} else {
			e = a - 100;
		}
		if (a <= 250) {
			f = 0;
		} else {
			f = a - 250;
		}
		d = (e) * 25 + b * 15 + c * 20;
		e = (f) * 45 + b * 35 + c * 25;
		d = d / 100;
		e = e / 100;
		System.out.println("plan A costs " + d);
		System.out.println("plan B costs " + e);

		if (d == e) {
			System.out.println("plan A and B are same price");
		} else if (d < e) {
			System.out.println("Plan A is cheapest");
		} else {
			System.out.println("plan B is cheapest");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int o = in.nextInt();

		printPlanDetails(m, n, o);
	}

}
