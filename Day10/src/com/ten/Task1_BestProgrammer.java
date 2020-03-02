package com.ten;
import java.util.*;

public class Task1_BestProgrammer {

	public int findType(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			return 0;
		} else if (sum < n) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Task1_BestProgrammer t = new Task1_BestProgrammer();
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int res = t.findType(num);
		System.out.println(res);
		if (res == 0) {
			System.out.print(num+" "+"is perfect");
		} else if (res == 1) {
			System.out.print(num+" "+"is deficient");
		} else {
			System.out.print(num+" "+"is abudant");
		}

	}

}
