package com.five.saravana;
import java.util.*;

public class Task6Day5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = Math.abs(a-b);
		
		for (int i = 0; i < c/60; i++) {
			a = a+60;
			System.out.println("all changes are in year:"+a);
		}
	}

}
