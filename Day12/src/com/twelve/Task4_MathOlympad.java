package com.twelve;

import java.util.Scanner;

public class Task4_MathOlympad {
	public static int sumation(int n, int m)
	{
		int sum=0;
		if(m>1)
		{
			return sumation(sumation(n,m-1),1);
		}
		else
		{
			for(int i=1; i<=n; i++)
			{
				sum += i;
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		
		int k=sumation(n,m);
		System.out.println(k);
	}

}
