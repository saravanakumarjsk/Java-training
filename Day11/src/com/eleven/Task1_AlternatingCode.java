package com.eleven;

import java.util.*;

public class Task1_AlternatingCode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int count = 0;

		for (int i = 0; i < s.length() - 2; i++)
		{
			if (s.charAt(i) == s.charAt(i + 2)) 
			{
				count++;
				//
			} else {
				count = count;
			}
		}

		if (count == s.length() - 2)
		{
			System.out.println("yes");
		} else 
		{
			System.out.println("NO");
		}

	}
}
