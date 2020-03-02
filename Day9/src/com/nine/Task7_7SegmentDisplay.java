package com.nine;
import java.util.*;

public class Task7_7SegmentDisplay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num3 = input.nextInt();
		int rem=0, sav=0;
		int count=0;
		
		while (num3 > 0) {
			count++;
			rem = num3 % 10;
			sav = sav * 10 + rem;
			num3 = num3 / 10;
			
		}
		System.out.println(count);

	}

}
