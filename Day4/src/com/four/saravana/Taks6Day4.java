package com.four.saravana;
import java.util.*;

public class Taks6Day4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		int k = input.nextInt();
		
		int a = Math.abs((m+k)-n);
		int b = Math.abs(m-(n+k));
		int c = Math.min(a, b);
		System.out.println(c);
//		System.out.println(m%100);

	}

}
