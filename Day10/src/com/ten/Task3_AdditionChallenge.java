package com.ten;

import java.util.Scanner;

public class Task3_AdditionChallenge {
	
	public static int findSum(int n)
	{
		double sum = (int)0;
		for(double i=0; i<=n; i++)
		{
			sum = sum+Math.pow(2, i);
		}
		return (int) sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(findSum(num));

	}

}
