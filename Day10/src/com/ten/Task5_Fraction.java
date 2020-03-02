package com.ten;

import java.util.Scanner;

public class Task5_Fraction {
	public static void printValue(int a, int b) {
		int c = a / b;
		int d = a % b;
		if (a % b == 0) {
			System.out.println(a / b);
		} else {
			System.out.println(c + " " + d + "/" + b);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		printValue(a, b);

	}

}
