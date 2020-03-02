package com.ten;

import java.util.*;

public class DayTenDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		int columns = 1;
		int start;
		int mc;
		int space = n / 2 + 1;

		for (int i = 1; i <= n; i++) {
			if (i <= n / 2 + 1) {
				start = i;
				space--;
			} else {
				start = n + 1 - i;
				space++;
			}

			for (int s = 1; s <= space; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= columns; j++) {
				mc = columns / 2 + 1;
				System.out.print(start);

				if (j < mc) {
					start--;
				} else {
					start++;
				}
			}
			if (i <= n / 2) {
				columns += 2;
			} else {
				columns -= 2;
			}
			System.out.println();

		}
	}

}
