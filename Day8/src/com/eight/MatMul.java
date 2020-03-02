package com.eight;

public class MatMul {

	public static void main(String[] args) {
		int a[][] = {
			      {1, 2, 3}, 
			      {4, 5, 6}, 
			      {7, 8, 9}, 
			};
		
		int b[][] = {
				{7, 8, 9}, 
				{4, 5, 6}, 
				{1, 2, 3},
		};
		
		int c[][] = new int[3][3];
		
		for(int row=0; row<a.length; row++)
		{
			for(int col=0; col<a.length; col++)
			{
				c[row][col] = 0;
				
				for(int k=0; k<a.length; k++)
				{
					c[row][col] = c[row][col] + a[row][k] * b[k][col];
					
					System.out.println("row "+ row + " col "+ col);
					System.out.println("k "+k);
					System.out.println("a row "+a[row][k]);
					System.out.println("b col "+b[k][col]);
					System.out.println("c[row][col] "+c[row][col]);
					System.out.println();
				}
//				System.out.println(c[row][col]);
//				System.out.print(sum+" ");
			}
			System.out.println();
//			System.out.println();
		}

		for(int row=0; row<a.length; row++)
		{
			for(int col=0; col<a.length; col++)
			{
				System.out.printf("%-5d", c[row][col]);
			}
			System.out.println();
		}
	}

}
