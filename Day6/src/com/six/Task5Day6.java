package com.six;
import java.util.*;

public class Task5Day6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int arr[] = new int[a];
		
		int b = input.nextInt();
		int k = 0, sum = 0;
		
		for(int i=0; i<a; i++) {
			arr[i] = input.nextInt();
		}
		
		for(int i=0; i<a; i++) {
			k = arr[i]/b;
			sum = sum+k;
		}
		System.out.println(sum);
	}

}
