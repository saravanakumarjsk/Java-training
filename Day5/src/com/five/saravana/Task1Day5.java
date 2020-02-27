package com.five.saravana;

import java.util.*;

public class Task1Day5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		int count = 0;

		while (num > 0) {
			count = (num % 10 == 4) ? count + 1 : count;
			num = num / 10;
		}

		System.out.println(count);
	}

}
