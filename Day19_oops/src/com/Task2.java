package com;
import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Set<String> s = new HashSet<String>();
		
		boolean res = true;
		
		System.out.println("Enter the User name");
		s.add(input.next());
		
		while(res)
		{
			System.out.println("Do you want to continue (y/n)");
			if(input.next().charAt(0) == 'y') 
			{
				System.out.println("Enter the user name");
				s.add(input.next());
			}
			else
			{
				res = false;
			}
		}
		System.out.println(s);

	}

}
