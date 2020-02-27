package com.four.saravana;

import java.util.*;

public class Task2Day4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// discounted_price = original_price - (original_price * discount / 100)

		int cost = input.nextInt(); // cost of ticket
		int num = input.nextInt(); // no of tickets

		double org = (cost * num);

		if (num < 50) {
			System.out.printf("%.2f", org);
		} else if (num >= 50 && num <= 100) {
			double dis = (org - (org * 10 / 100));
			System.out.printf("%.2f", dis);
		} else if (num >= 101 && num <= 200) {
			double dis = (org - (org * 20 / 100));
			System.out.printf("%.2f", dis);
		} else if (num >= 201 && num <= 400) {
			double dis = (org - (org * 30 / 100));
			System.out.printf("%.2f", dis);
		} else if (num >= 401 && num <= 500) {
			double dis = (org - (org * 40 / 100));
			System.out.printf("%.2f", dis);
		} else if (num > 500) {
			double dis = (org - (org * 50 / 100));
			System.out.printf("%.2f", dis);
		} else {
			System.out.println("enter valid num");
		}

	}

}
