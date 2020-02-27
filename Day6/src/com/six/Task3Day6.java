package com.six;

import java.util.*;

public class Task3Day6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		int a = num;
		int rem2 = 0, sav2 = 0;
		int rem = 0, sav = 0, count = 0;

		while (count <= 1) {
			count++;
			rem = num % 10;
			sav = sav * 10 + rem;
			num = num / 10;

		}
		// System.out.println(sav);
		// System.out.println(num);
		int num2 = num % 10;
		int num3 = num / 10;
		// System.out.println(num2+" "+num3);
		while (num3 > 0) {
			rem2 = num3 % 10;
			sav2 = sav2 * 10 + rem2;
			num3 = num3 / 10;
		}
		// System.out.println("num3 "+sav2);
		System.out.println(sav2 + "" + num2 + "" + sav);
	}

}
