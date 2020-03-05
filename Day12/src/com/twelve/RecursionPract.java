package com.twelve;

import java.util.Scanner;

public class RecursionPract {
	static void displaySum(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum += i;
		}
		System.out.println(sum);
	}
	
	static int disSum(int n)
	{
		if(n==1)
			return 1;
		else
			return n+disSum(n-1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
//		int sum=0;
		
//		for(int i=1; i<=n; i++)
//		{
//			sum += i;
//		}
//		System.out.println(sum);
//		input.close();
		
//		displaySum(n);
		System.out.println(disSum(n));

	}

}
