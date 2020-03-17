package com;
import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> l = new ArrayList<String>();
		
		boolean res = true;
		
		int count=1;
		
		System.out.printf("Enter the user name %d:", count);
		l.add(input.next());
		
		while(res)
		{
			System.out.println("Do you want to continue?(y/n)");
			if(input.next().charAt(0) == 'y')
			{
				count++;
				System.out.printf("Enter the user name %d:", count);
				l.add(input.next());
			}
			else
			{
				res = false;
			}
		}
		System.out.println(l);
	}

}
