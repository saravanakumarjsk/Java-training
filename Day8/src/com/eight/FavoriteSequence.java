package com.eight;

import java.util.*;

public class FavoriteSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		int seq[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			seq[i] = input.nextInt();
		}

		int len = input.nextInt();
		int fav[] = new int[len];

		

		for (int i = 0; i < len; i++) {
			fav[i] = input.nextInt();
		}
		
		int count=0;
		for(int i=0; i<fav.length; i++)
		{	
			for(int j=0; j<seq.length; j++)
			{
				if(fav[i] == seq[j])
				{
					count++;
				}
				else
				{
					count=count;
				}
			}
		}
		if(count == fav.length)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}


















