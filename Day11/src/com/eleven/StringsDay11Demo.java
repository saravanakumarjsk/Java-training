package com.eleven;
import java.util.*;

public class StringsDay11Demo {

	public static void main(String[] args) {
		
		String name = "Saravana";
		String loc = "Chennai";
		String loc2 = loc;
		
//		char loc[] = {'L', 'o', 'n', 'd', 'o', 'n'};
		System.out.println(loc);
		
		String loc1 = new String("Kochi");
		String loc21 = loc1;
		
		String abcd = "abcd";
		System.out.println(loc1);
		
		if(loc1 != loc1)
		{
			System.out.println("yes");
		}
		else
			System.out.println("No");
		
		if(loc == loc2)
		{
			System.out.println("yes");
		}
		if(loc.equals(loc2))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		if(loc1.equals(loc21)) {
			System.out.println("h yes");
		}
		else {
			System.out.println("h yes");
//		}

	}

}
}
