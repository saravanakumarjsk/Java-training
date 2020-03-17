package com;

import java.util.*;

public class Demo1Collections {

	public static void main(String[] args) {
		List l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		
		System.out.println("List: "+ l);
		
		Enumeration e = Collections.enumeration(l);
		
		System.out.println("enumeration over list");
		
		while(e.hasMoreElements())
			System.out.println("value is: "+ e.nextElement());
		

	}

}
