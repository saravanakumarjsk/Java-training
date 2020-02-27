package com.five.saravana;
import java.util.*;

public class Task3Day5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int n = input.nextInt();
		
		for (int i = 1; i<=n; i++)
		
		if(i%2 == 0) {
			b = b*2;
		}else {
			a = a*2;
		}
		System.out.println(a+b);
	}

}
