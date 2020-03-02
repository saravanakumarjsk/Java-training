package com.eight;
import java.util.*;

import java.util.Scanner;

public class LibraryTimeManagement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		int fav[] = new int[num];
		int seq[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			seq[i] = input.nextInt();
		}

		for (int i = 0; i < num; i++) {
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
		System.out.println(count);

	}

}
