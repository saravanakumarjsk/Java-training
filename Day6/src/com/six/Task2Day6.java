package com.six;
import java.util.*;

public class Task2Day6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int c = a;
		int b = a;
		
		int rem = 0;
		int sav = 0;
		
		while(a>0) {
			rem = a%10;
			sav = (sav * 10)+rem;
			a = a/10;
		}
		
		int a1 = c*c;
		int b1 = sav*sav;
		int rem2 = 0;
		int sav2 = 0;
		
		while(b1>0) {
			rem2 = b1%10;
			sav2 = (sav2 * 10)+rem2;
			b1 = b1/10;
		}
		
//		System.out.println(a1+" "+sav2);
		if(a1==sav2) {
			System.out.println("Adam");
		}
		else {
			System.out.println("Not Adam");
		}
		
		

	}

}
