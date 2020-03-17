package com;
import java.util.*;

public class Demo2_Iterators {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
//		Iterator itr = list.iterator();
//		
//		System.out.println("Iterator Forward");
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
//		System.out.println();
		
		ListIterator litr = list.listIterator();
		
		litr.next();
		
		litr.set(8000);
		
		
		litr = list.listIterator();
		System.out.println("ListIterator Forward");
		
		System.out.println(list);
		
//		while(litr.hasNext())
//		{
//			System.out.println(litr.next());
//		}
		
		
		System.out.println();
		
//		System.out.println("backward");
//		
//		while(litr.hasPrevious())
//		{
//			System.out.println(litr.previous()+" ");
//		}
//		System.out.println();
		

	}

}
