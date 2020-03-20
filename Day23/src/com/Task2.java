package com;

import java.util.Scanner;
import java.util.*;

interface Stall{
	public void display();
}

class GoldStall implements Stall{
	private String stallname;
	private int cost;
	private String ownerName;
	private int tvset;
	
	public GoldStall(String stallname, int cost, String ownerName, int tvset)
	{
		this.stallname = stallname;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvset = tvset;
	}
	
	public void display()
	{
		System.out.println("Stall Name: "+ stallname);
		System.out.println("Cost: "+ cost+" Rs");
		System.out.println("Owner Name: "+ ownerName);
		System.out.println("tvset: "+ tvset);
	}
}

class PremiumStall implements Stall{
	private String stallname;
	private int cost;
	private String ownerName;
	private int tvset;
	
	public PremiumStall(String stallname, int cost, String ownerName, int tvset)
	{
		this.stallname = stallname;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvset = tvset;
	}
	
	public void display()
	{
		System.out.println("Stall Name: "+ stallname);
		System.out.println("Cost: "+ cost+" Rs");
		System.out.println("Owner Name: "+ ownerName);
		System.out.println("tvset: "+ tvset);
	}
}

class ExecutiveStall implements Stall{
	private String stallname;
	private int cost;
	private String ownerName;
	private int tvset;
	
	public ExecutiveStall(String stallname, int cost, String ownerName, int tvset)
	{
		this.stallname = stallname;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvset = tvset;
	}
	
	public void display()
	{
		System.out.println("Stall Name: "+ stallname);
		System.out.println("Cost: "+ cost+" Rs");
		System.out.println("Owner Name: "+ ownerName);
		System.out.println("tvset: "+ tvset);
	}
}



public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stall st = null;
		
		System.out.println("1. Golden Stall");
		System.out.println("2. Premium Stall");
		System.out.println("3. Executive Stall");
		
		System.out.println("Enter your choice:");
		int n = input.nextInt();
		
		System.out.println("Enter input in csv format");
		String[] s = input.next().split(",");
		

		switch(n)
		{
		case 1:
			st = new GoldStall(s[0], Integer.parseInt(s[1]), s[2], Integer.parseInt(s[3]));
			st.display();
			break;
		case 2:
			st = new PremiumStall(s[0], Integer.parseInt(s[1]), s[2], Integer.parseInt(s[3]));
			st.display();
			break;
		case 3:
			st = new ExecutiveStall(s[0], Integer.parseInt(s[1]), s[2], Integer.parseInt(s[3]));
			st.display();
			break;
		}
		
		
	}

}
