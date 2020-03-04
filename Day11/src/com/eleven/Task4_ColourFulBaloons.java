package com.eleven;

import java.util.Scanner;

public class Task4_ColourFulBaloons {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		int a=0, b=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == 'a')
				a++;
			else
				b++;
		}
		int res = (a<b)?a:b;
		System.out.println(res);
		input.close();

	}

}
