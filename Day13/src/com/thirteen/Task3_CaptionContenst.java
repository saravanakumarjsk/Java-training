package com.thirteen;
import java.util.*;

public class Task3_CaptionContenst {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String f = input.next();
		String s = input.next();
		
		int min=0;
		int max=0;
		
		int fc = 0;
		int sc = 0;
		
		for(int i=0; i<f.length();i++)
		{
			if(f.charAt(i) != s.charAt(i) && (f.charAt(i) != '?' && s.charAt(i) != '?')){
				min++;
			}
		}
		
		for(int i=0; i<f.length();i++)
		{
			if(f.charAt(i) == '?')
				fc++;
			if(s.charAt(i) == '?')
				sc++;
		}
		
		int m = Math.max(fc, sc);
		max  = m+min;
		System.out.println(min+" "+max);
	}

}
