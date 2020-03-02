package com.nine;
import java.util.*;

public class Task1TeamEvent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int rem=0, sav=0;
		int c=0; 
		
		if(num<10)
		{
			System.out.println("Invalid");
		}
		else
		{
			c = num%10;
			while(num != 0)
			{
				sav = sav*10 + c;
				if(num < 10)
				{
					rem = num;
				}
				num = num/10;
			}
		}
		System.out.println(Math.abs(c -rem));

	}

}
