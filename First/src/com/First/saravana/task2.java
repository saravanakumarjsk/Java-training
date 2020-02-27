package com.First.saravana;

//import java.util.Scanner;
import java.text.*;
import java.util.*;

public class task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int br;
		System.out.println("Enter branding expense: ");
		br = input.nextInt();
		
		int trv;
		System.out.println("Enter travel expense: ");
		trv = input.nextInt();
		
		int fo;
		System.out.println("Enter food expense: ");
		fo = input.nextInt();
		
		
		int lo;
		System.out.println("Enter logistics expense: ");
		lo = input.nextInt();
		
		float tot = br+trv+fo+lo;
		float brpr = (br/tot)*100;
//		
		
		float trvl = (trv/tot)*100;
		
		float food = (fo/tot)*100;
		
		float logi = (lo/tot)*100;
//		
		
		
		System.out.printf("Total Expenses: %.2f%%%n",tot);
		System.out.printf("Branding Expenses percentage: %.2f%%%n",brpr);
		System.out.printf("Travel Expenses percentage: %.2f%%%n", trvl);
		System.out.printf("Food Expenses percentage: %.2f%%%n", food);
		System.out.printf("Logistics Expenses percentage: %.2f%%%n", logi);


	}

}
