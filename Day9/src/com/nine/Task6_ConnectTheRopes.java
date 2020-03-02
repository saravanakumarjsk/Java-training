package com.nine;
import java.util.*;

public class Task6_ConnectTheRopes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int k = input.nextInt();
		int arr[] = new int[num];

		for(int i=0; i<num; i++) {
			arr[i] = input.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<num; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum - ((num-1)*k*2));
	}
}
