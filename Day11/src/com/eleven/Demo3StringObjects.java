package com.eleven;
import java.util.*;
public class Demo3StringObjects {

	public static void main(String[] args) {
		//determine the length
		System.out.println("hello".length());
		String str = "Welcome";
		System.out.println(str.length());
		
		//concat
		String s1 = "Welcome";
		String s2 = " to java";
		System.out.println(s1.concat(s2)); // s1+s2
		
		// is empty
		String s5 = new String("");
		String s55 = "";
		System.out.println(s5.isEmpty());
		
		// trim and upper case
		System.out.println("   welcome to java   ".trim().toUpperCase());
		System.out.println("   WELCOME TO JAVA   ".trim().toLowerCase());
		
		//valueof
		boolean var = true;
		String result = String.valueOf(var);
		System.out.println(result);
		System.out.println(String.valueOf(12.43f));
		
		//replace
		String s7 = "replace data with my_name";
		String s8 = s7.replace("data", "saravana");
		System.out.println(s8);
		
		//substring
		String s9 = "replace data with my_name";
		String s10 = s9.substring(13,17);
		System.out.println(s10);
		
		//split
		String s11 = "replace-data-with-my_name";
		String[] split = s11.split("-",3);// where 3 represents the number of strings to be divied into
		for(String s: split) {
			System.out.println(s);
		}
		
		//toCharArray
		String st = "hello";
		char[] arr = "hello".toCharArray();
		System.out.println(st.charAt(0));
		System.out.println(arr[0]);
		
		//startswith
		String name = "Saravana";
		System.out.println(name.startsWith("Sa"));
		
		//contains
		System.out.println("Welcome to java".contains("come"));
		
		//indexOf
		System.out.println("Welcome to java".indexOf("W"));
		
		//Arrays.toString(arr)
		String kev = "Kevin saravana kumar";
		String[] names = kev.split(" ");
		System.out.println(Arrays.toString(names));
		
		//Arrays.toString(arr)
		String[][] rev = {{"Aravind"}, {"saravana"}, {"kumar"}};
//		String[][] nam = rev.split(" ");
		System.out.println(Arrays.deepToString(rev));
		
	}

}








