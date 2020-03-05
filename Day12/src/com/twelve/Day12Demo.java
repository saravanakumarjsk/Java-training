package com.twelve;
import java.util.*;

public class Day12Demo {
	static String charRemoveAt(String s, int j)
	{
		return s.substring(0, j) + s.substring(j+1);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String f = input.nextLine().toLowerCase();
		String s = input.nextLine().toLowerCase();

		int count=0;
		int c2=0;
		for(int i=0; i<f.length(); i++)
		{
			for(int j=0; j<s.length(); j++)
			{
				if(f.charAt(i) == s.charAt(j))
				{
					s = charRemoveAt(s,j);
					count++;
				}
			}
		}
		c2 = f.length() - count + s.length();
		
		String s3 = "Saravana";
//		s3 = charRemoveAt(s3, 13);
		
		
	}

}

//Saravana
//Bhupesh
