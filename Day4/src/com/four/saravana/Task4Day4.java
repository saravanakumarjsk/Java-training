package com.four.saravana;

import java.util.*;

public class Task4Day4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();

		int max = a>b?a:b;
		System.out.printf("%d %d", max, a+b);
	}
}
