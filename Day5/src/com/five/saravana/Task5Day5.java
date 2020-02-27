package com.five.saravana;

import java.util.*;


public class Task5Day5 {
	
	static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
  
    
    static int findGCD(int arr[], int n) 
    { 
        int result = arr[0]; 
        for (int i = 1; i < n; i++){ 
            result = gcd(arr[i], result); 
  
            if(result == 1) 
            { 
               return 1; 
            } 
        } 
  
        return result; 
    } 

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("enter number of elements");

		int n = input.nextInt();

		int arr[] = new int[n];

		System.out.println("enter elements");

		for (int i = 0; i < n; i++) {// for reading array
			arr[i] = input.nextInt();
		}
		
		int nk = arr.length; 
        int fin =  findGCD(arr, nk);
        
        for (int i = 0; i <= n; i++) {
        	System.out.print((arr[i])/fin+" ");
        }
	}
}
