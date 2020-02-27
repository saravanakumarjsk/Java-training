package com.second.saravana;
import java.util.*;

public class Task4Day2 {
	 

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int s = 0;
		
		System.out.println("Sides:");
		int side = input.nextInt();
		
		System.out.println("count:");
		int res = input.nextInt();
		
		double val = Math.sqrt(res);
		for (int i = 1; i <= val; i++) {
			s += side;
		}
		System.out.println("Area of the largest possible square is "+ s*s);
		
	}
	
}

