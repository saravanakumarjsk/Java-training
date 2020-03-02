package com.nine;
import java.util.*;

public class Task2LuckyPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int n = input.nextInt();
		
		int as = 0;
		int bs = 0;
		
		for(int i=1; i<=n; i++)
		{
			if(i%2 == 0)
			{
				as += a*2;
			}
			else {
				bs += b*2;
			}
		}
		System.out.println(as+bs);
	}

}
