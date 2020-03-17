package com;
import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		long st = System.nanoTime();
		for(int i=0; i<10000; i++)
		{
			ll.add(i);
		}
		
		for(int i=0; i<10000; i++)
		{
			ll.get(i);
		}
		
		long end_time = System.nanoTime();
		long res = end_time - st;
		System.out.println("LinkedList  "+res);

	}

}
