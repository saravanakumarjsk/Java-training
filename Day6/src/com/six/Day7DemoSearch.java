package com.six;
import java.util.*;

public class Day7DemoSearch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr1[] = {3,4,5,6,7,8};
		
		int se = input.nextInt();
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == se) {
				System.out.println("found at "+(i+1));
				break;
			}
		}
		
		

	}

}
