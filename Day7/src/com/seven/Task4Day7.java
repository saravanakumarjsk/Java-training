package com.seven;
import java.util.*;

public class Task4Day7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int a[] = new int[num];
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			a[i] = input.nextInt();
		}
	
		for(int i=0; i< num-1; i += 2) {
			if(a[i] > a[i+1]) {
				sum = sum+a[i+1];
			}
			else {
				sum = sum+a[i];
			}
		}
		System.out.println(sum);
	}
}