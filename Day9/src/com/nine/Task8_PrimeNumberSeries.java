package com.nine;

import java.util.*;

public class Task8_PrimeNumberSeries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int count = 0, i = 2, j, count0 = 0;
		
		while (count < a) 
		{
			count0 = 0;
			for (j = 1; j <= i; j++) 
			{
				if (i % j == 0) {
					count0++;
				} 
			}
			if (count0 == 2) 
			{
				System.out.print(i + " ");
				count++;
			} 
			i = i + 1;
		}
	}
}