package com.eight;
import java.util.*;

public class BestCoupleEvent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tot = input.nextInt();
		int a[] = new int[tot];
		
		for(int i=0; i<tot; i++)
		{
			a[i] = input.nextInt();
		}
		
		int temp =0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		
		
		for(int i=0; i<a.length; i++)
		{
			int count = 0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
				else {
					count=count;
				}
			}
			if(count<2) {
				System.out.println(a[i]);
			}
		}

		
	}
}
