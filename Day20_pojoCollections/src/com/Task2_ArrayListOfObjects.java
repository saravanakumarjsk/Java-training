package com;
import java.util.*;

public class Task2_ArrayListOfObjects {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<String> lst = new ArrayList<String>();
		
		System.out.println("enter the number of halls");
		int n=input.nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
			System.out.println("Enter the name of hall "+i);
			lst.add(input.next().toUpperCase());
		}
		
		ListIterator<String> litr = lst.listIterator();
		
		System.out.println("Enter the hall to be found: ");
		String s = input.next().toUpperCase();
		
		
		while(litr.hasNext())
		{
			if(litr.next().contains(s))
			{
				System.out.println(s+" is found at posistion "+lst.indexOf(s));
			}
		}
		input.close();

	}

}
