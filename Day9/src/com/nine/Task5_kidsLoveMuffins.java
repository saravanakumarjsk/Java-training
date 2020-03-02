package com.nine;
import java.util.*;

public class Task5_kidsLoveMuffins {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int sat = input.nextInt();
		
		int a[] = new int[num];
		
		for(int i=0; i<num; i++)
		{
			a[i] = input.nextInt();
		}
		int rem = 0;
		for(int i=0; i<a.length; i++)
		{
			rem += a[i]/sat;
		}
		System.out.println(rem);
	}

}
