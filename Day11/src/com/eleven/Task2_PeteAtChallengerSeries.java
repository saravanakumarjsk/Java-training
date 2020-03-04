package com.eleven;

import java.util.Scanner;

public class Task2_PeteAtChallengerSeries {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		int c3=0,c2=0,i;
		int m = 0, e = 0;
		
		for (i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i) == '0') 
			{
				e++;
				// System.out.println(s.charAt(i));
			} else 
			{
				m++;
			}
			if (m == 11 && e < 10) 
			{
				System.out.println("Win");
				break;
			} 
			else if (e == 11 && m < 10) 
			{
				System.out.println("Loose");
				break;
			} 
			else if (e == 10 && m == 10) 
			{
				break;
			}
		}
		if (e == 10 && m == 10) 
		{
			for(int j=i+1; j<s.length();j++) 
			{
				if (s.charAt(j) == '1') 
				{
					c3=0;
					c2++;
					if(c2==2) 
					{
						System.out.println("Win");
					}
				}
				else 
				{
					c2=0;
					c3++;
					if(c3==2) 
					{
						System.out.println("Loose");
					}
				}
		}
		
			
		}
		
	}
	// 0101111111111
}
