package com.thirteen;

import java.util.*;

public class Task1_SumOfpowersOfnthPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int n = input.nextInt();

		System.out.println(NumberOfWays.checkRecursive(x, n, 1, 0));
	}
}

class NumberOfWays {

	static int CountWays(int num, int n) {
		if (n == 0)
			return 1;
		else if (n % 2 == 0)
			return CountWays(num, n / 2) * CountWays(num, n / 2);
		else
			return num * CountWays(num, n / 2) * CountWays(num, n / 2);
	}

	static int checkRecursive(int x, int n, int curr_num, int curr_sum) {
		int results = 0;

		int p = CountWays(curr_num, n);
		while (p + curr_sum < x) {

			results += checkRecursive(x, n, curr_num + 1, p + curr_sum);
			curr_num++;
			p = CountWays(curr_num, n);
		}

		if (p + curr_sum == x)
			results++;

		return results;
	}
}
