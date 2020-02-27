package com.six;
import java.util.*;

public class Task6Day6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int arr[] = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = input.nextInt();
		}
		int sum = 0;
		for(int i=0; i<num; i++) {
			sum += arr[i];
		}
		
		int y = 0, rem = 0, sum1=0;
		
		int qr = sum % num;
		for(int i=0; i < num; i++) {
			y = sum/num;
			rem = arr[i] - y;
			if(rem < 0) {
			sum1 = sum1-rem;
			}
		}
		System.out.println(qr+" "+Math.abs(sum1));

	}

}
