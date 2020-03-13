package com.fourteen;

public class Task1_commandArgs {

	public static void main(String[] args) {
		
		System.out.println("Arguments:");
		for(String i:args)
		{
			System.out.println(i);
		}
		System.out.println("Number of Arguments is:"+args.length);
		
	}
}
