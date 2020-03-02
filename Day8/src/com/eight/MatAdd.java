package com.eight;
import java.util.*;

public class MatAdd {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
		
		int a[][] = {
			      {1, 2, 3}, 
			      {4, 5, 6}, 
			      {7, 8, 9}, 
			};
		
		int b[][] = {
				{9, 8, 7}, 
			    {6, 5, 4}, 
			    {3, 2, 1},
		};
		
//		System.out.println("row "+ a.length);
//		System.out.println("col "+ a[0][1]);
//		System.out.println("col "+ a[2].length);
		
		for(int row=0; row < a.length; row++) 
		{
			for(int col = 0; col < a[0].length; col++)
			{
				int res = a[row][col] + b[row][col];
				System.out.print(res+" ");
			}
			System.out.println(" ");
		}

	}

}
