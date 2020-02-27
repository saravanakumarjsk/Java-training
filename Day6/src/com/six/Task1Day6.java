package com.six;

import java.util.*;

public class Task1Day6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int tot1 = 0;
		int temp1 = 0;
		
		int tot2 = 0;
		int temp2 = 0;
		
		for(int i = 1; i< a; i++) {
			if(a%i == 0) {
				temp1 = i;
//				System.out.println("temp "+temp1);
				tot1 += temp1;
//				System.out.println("tot "+tot1);
			}
			
		}
		
		for(int j = 1; j< b; j++) {
			if(b%j == 0) {
				temp2 = j;
				tot2 += temp2;
			}
		}
		
		System.out.println(tot1);
		System.out.println(tot2);
		if(tot1 == b && tot2 == a) {
			System.out.println("amicable");
		}
		else
			System.out.println("not amicable");

	}

}
