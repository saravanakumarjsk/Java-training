package com.five.saravana;

import java.util.*;

public class Task8Day5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int j, count = 0, sumA = 0, sumB = 0;
		int a = in.nextInt();
		int arr[] = new int[a];

		for (int i = 0; i < a; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < a; i++) {
			if (i % 2 == 0) {
				if (arr[i] == 1 && i <= a - 5) {
					for (j = i + 1; j <= i + 4; j++) {
						if (arr[j] < 11 && arr[j] != 1) {
							count++;
						} else {
							break;
						}
					}
					if (count == 4) {
						sumA = sumA + count;
						count = 0;
						System.out.println("Player A scores 4 point(s)");
					} else {
						count = 0;
					}
				} else if (arr[i] == 13 && i <= a - 4) {
					for (j = i + 1; j <= i + 3; j++) {
						if (arr[j] < 11 && arr[j] != 1) {
							count++;
						} else {
							break;
						}
					}
					if (count == 3) {
						sumA = sumA + count;
						count = 0;
						System.out.println("Player A scores 3 point(s)");
					} else {
						count = 0;
					}
				} else if (arr[i] == 12 && i <= a - 3) {
					for (j = i + 1; j <= i + 2; j++) {
						if (arr[j] < 11 && arr[j] != 1) {
							count++;
						} else {
							break;
						}
					}
					if (count == 2) {
						sumA = sumA + count;
						count = 0;
						System.out.println("Player A scores 2 point(s)");
					} else {
						count = 0;
					}
				} else if (arr[i] == 11 && i <= a - 2) {
					for (j = i + 1; j <= i + 1; j++) {
						if (arr[j] < 11 && arr[j] != 1) {
							count++;
						} else {
							break;
						}
					}
					if (count == 1) {
						sumA = sumA + count;
						count = 0;
						System.out.println("Player A scores 1 point(s)");
					} else {
						count = 0;
					}
				}

			} else {
				if (arr[i] == 1 && i <= a - 5) {
					for (j = i + 1; j <= i + 4; j++) {
						if (arr[j] < 11 && arr[j] != 1) {
							count++;
						} else {
							break;
						}
					}
					if (count == 4) {
						sumB = sumB + count;
						count = 0;
						System.out.println("Player B scores 4 point(s)");
					} else {
						count = 0;
					}
				} else if (arr[i] == 13 && i <= a - 4) {
					for (j = i + 1; j <= i + 3; j++) {
						if (arr[j] < 11 && arr[j] != 1) {
							count++;
						} else {
							break;
						}
					}
					if (count == 3) {
						sumB = sumB + count;
						count = 0;
						System.out.println("Player B scores 3 point(s)");
					} else {
						count = 0;
					}
				} else if (arr[i] == 12 && i <= a - 3) {
					for (j = i + 1; j <= i + 2; j++) {
						if (arr[j] < 11 && arr[j] != 1) {
							count++;
						} else {
							break;
						}
					}
					if (count == 2) {
						sumB = sumB + count;
						count = 0;
						System.out.println("Player B scores 2 point(s)");
					} else {
						count = 0;
					}
				} else if (arr[i] == 11 && i <= a - 2) {
					for (j = i + 1; j <= i + 1; j++) {
						if (arr[j] < 11 && arr[j] != 1) {
							count++;
						} else {
							break;
						}
					}
					if (count == 1) {
						sumB = sumB + count;
						count = 0;
						System.out.println("Player B scores 1 point(s)");
					} else {
						count = 0;
					}
				}

			}
		}
		System.out.println("Player A:" + sumA);
		System.out.println("Player B:" + sumB);

	}

}
