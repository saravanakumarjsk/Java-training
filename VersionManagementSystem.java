package com.first;

import java.util.*;

// Version Management System

public class VersionManagementSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int ig = input.nextInt();
		int tr = input.nextInt();

		int ign[] = new int[ig];
		int trk[] = new int[tr];

		for (int i = 0; i < ig; i++) {
			ign[i] = input.nextInt();
		}

		for (int i = 0; i < tr; i++) {
			trk[i] = input.nextInt();
		}
		
		// for both ig and tr
		
		int count = 0, count1 = 0;
		for(int i=0; i<ign.length; i++)
		{
			for(int j=0; j<trk.length; j++)
			{
				if(ign[i] == trk[j])
				{
					count++;
				}
				else {
					count = count;
				}
			}
		}
		
		int size = ign.length + trk.length;
		
		int c[] = new int[size];
		int idx = 0;
		int sum=0;
		int temp=0;
		
		// merge two index
		
		for(int i=0; i<ign.length; i++)
		{
			c[i] = ign[i];
			idx++;
		}
		for(int j=0; j<trk.length; j++)
		{
			c[idx++] = trk[j];
		}
		
		// sorting two arrays
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c.length; j++)
			{
				if(c[i]<c[j])
				{
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
					
				}
			}
		}
		
		// finding duplicate count
		int duplicate = 0;
		
		for(int i=0; i<c.length-1; i++)
		{
			if(c[i] == c[i+1])
			{
				duplicate++;
			}
			else {
				duplicate = duplicate;
			}
			
		}
		
		int arrlen = c.length - duplicate;
		int s = n - arrlen;
		
		System.out.print(duplicate+" "+s);

	}

}








