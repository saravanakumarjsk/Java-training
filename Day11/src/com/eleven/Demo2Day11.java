package com.eleven;

import java.util.Arrays;

public class Demo2Day11 {
	int a=10;

	public static void main(String[] args) {
		
		String s1 = "Abhi saravana kumar";
		String[][] s2 = {{"Abhi"}, {"saravana"}, {"kumar"}};
		String[] names = s1.split(" ");
//		String[][] name = s2.split(" ");
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.deepToString(s2));
		Demo2Day11 obj1 = new Demo2Day11();
		Demo2Day11 obj2 = obj1;
		
		obj1.a = 20;
		
	}

}
