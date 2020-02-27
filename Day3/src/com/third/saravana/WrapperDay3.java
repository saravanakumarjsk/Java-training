package com.third.saravana;
import java.util.*;

public class WrapperDay3 {

	public static void main(String[] args) {
		int a = 10;
		Integer i = 25;
		
		// wrapper class
		Integer ii = a;
		int aa = i.intValue();
		
		Integer k = 25;
		float vn = k.intValue();
		
		System.out.println(aa);
		
		// converting string to int
		String s = "25";
		System.out.println(s+10);
		int bb = Integer.parseInt(s);
		
		System.out.println(bb+10);
		
		System.out.println(10+"25"+10);
	}
}
