package com.eleven;

import java.util.*;

public class Task3_BallsForChallenge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String f = input.nextLine().toUpperCase();
		String s = input.nextLine().toUpperCase();

		for(int i=0; i<f.length(); i++)
		{
			if(f.charAt(i)==s.charAt(i) && f.charAt(i)=='B')
			{
				System.out.print("W");
			}
			else if(f.charAt(i)==s.charAt(i) && f.charAt(i)=='W')
			{
				System.out.print("B");
			}
			else if(f.charAt(i)!=s.charAt(i))
			{
				System.out.print("B");
			}
		}

	}

}
