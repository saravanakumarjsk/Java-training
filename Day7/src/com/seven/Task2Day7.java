package com.seven;
import java.util.*;

public class Task2Day7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int rem=0, sav=0, cnt=0;
		
		while(num > 0) {
			rem = num % 10;
			sav = (sav * 10)+rem;
			num = num/10;
			cnt++;
		}
		System.out.println(cnt);

	}

}
