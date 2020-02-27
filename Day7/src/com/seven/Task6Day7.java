package com.seven;
import java.util.*;


public class Task6Day7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int c1 = 0, c2 = 0, c3 = 0;
		int a = input.nextInt();
		int arr[] = new int[a];
		
		for(int i=0; i<a; i++) {
			if(arr[i] == 2 || arr[i] == 3) {
				c1++;
			}else {
				c1=c1;
			}
		}
		
		for(int i=0; i<a; i++) {
			if(arr[i] == 2 || arr[i] == 3) {
				c2++;
			}else {
				c2=c2;
			}
		}
		
		for(int i=0; i<a; i++) {
			if(arr[i] == 2 || arr[i] == 3) {
				c3++;
			}else {
				c3=c3;
			}
		}
		
		if(c1 <= c2 && c2 <= c3) {
			System.out.println(c2);
		}
		else if(c2 <= c1 && c2 <= c3) {
			System.out.println(c2);
		}
		else  {
			System.out.println(c3);}

	}

}
