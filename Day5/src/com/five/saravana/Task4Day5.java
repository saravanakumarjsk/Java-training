package com.five.saravana;
import java.util.*;

public class Task4Day5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int odd = 0, even = 0;
		
		for (int i = 0; i < num; i++) {
			int ele = input.nextInt();
			if(ele % 2 == 0) {
				even+= 1;
			}
			else {
				odd += 1;
			}
		}
		System.out.println(even+" "+odd);
	}

}
