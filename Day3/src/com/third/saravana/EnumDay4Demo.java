package com.third.saravana;
import java.util.*;

public class EnumDay4Demo {
	
	public static void main(String[] args) {
		M m = M.FEB;
		System.out.println(m);
		
		for (int i = 0; i < M.values().length; i++) {
			System.out.println(M.values()[i]);
		}
	
		System.out.printf("%n");
		
		Name names;
		
		for (int i=0; i<Name.values().length; i++) {
			System.out.println(Name.values()[i]);
		}
		
		System.out.printf("%n");
		
		for(Name res: Name.values()) {
			System.out.println(res);
		}
		
		System.out.printf("%n");
		
		EnumSet.allOf(M.class).forEach(data -> System.out.println(data));
	}
}

enum M{
	JAN, FEB, MAR, APRIL
}

enum Name{
	sk, bg, vj, aj
}