package com.seven;
import java.util.*;

public class Task1BinarySearchDay7 {
	
	public int binarySearch(int arr[], int x) {
		int l = 0, r = arr.length - 1; 
		System.out.println(r);
		while(l < r) {
			int mid = l + (r-l)/2;
			
			if(arr[mid] == x) {
				return mid;
			}
			if(x > arr[mid]) {
				l = mid + 1;
			}
			if(x < arr[mid]) {
				r = mid -1;
			}
		}
		return -1;
	}
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the size: ");
		int size = input.nextInt();
		int a[] = new int[size];
		
		int temp = 0;
		
		for(int i=0; i<size; i++) {
			a[i] = input.nextInt();
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		System.out.println("enter the ele to be searched: ");
		
		int x = input.nextInt();
		
		Task1BinarySearchDay7 bs = new Task1BinarySearchDay7();
		int res = bs.binarySearch(a, x);
		if(res == -1) {
			System.out.println("invalid number");
		}
		else {
			System.out.println("number found at index "+res);
		}
		
	}

}
