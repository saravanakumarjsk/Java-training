package com.thirteen;

import java.util.Scanner;

public class Task4_WildcardMatching {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	String f = input.next();
	String s = input.next();
	
//	int min=0;
//	int max=0;
//	
	int fc = 0;
	int sc = 0;
	
	for(int i=0; i<f.length();i++)
	{
		if(f.charAt(i) == s.charAt(i) || (f.charAt(i) == '?' || s.charAt(i) == '?')){
			fc++;
		}
		
	}
	
	if(fc == f.length()) {
		System.out.println("yes");
		
	}
	else
	{
		System.out.println("No");
	}

	}

}
