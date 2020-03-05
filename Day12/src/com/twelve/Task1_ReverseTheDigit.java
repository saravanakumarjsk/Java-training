package com.twelve;

import java.util.Scanner;

class ReverseNumber{
	static int d=0;
	public static int reverse(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			d=d*10 + n%10;
			reverse(n/10);
			return d;
		}
	}
}

public class Task1_ReverseTheDigit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k=ReverseNumber.reverse(n);
		System.out.println(k);
		
	}

}
