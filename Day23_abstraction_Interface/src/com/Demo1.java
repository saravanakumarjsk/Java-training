package com;
import java.util.*;

public class Demo1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value = 234567;
		String[] digits = Integer.toString(value).split("");
//		System.out.println(Arrays.toString(digits));
		
		int b[] = new int[digits.length];
		
		for(int i=0; i<digits.length; i++)
		{
			b[i] = Integer.valueOf(digits[i]);
		}
		String s=null;
		int temp=0;
		Arrays.sort(b);
		
		for(int i=0; i<b.length; i++)
		{
			s = s+b[i];
		}
		System.out.println(s);
	}

}
