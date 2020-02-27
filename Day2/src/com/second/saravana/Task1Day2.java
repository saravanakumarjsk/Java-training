package com.second.saravana;
import java.util.*;

public class Task1Day2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the total num of people:");
		int total = input.nextInt();
		int first = (2*total)/7;
		int second = first * 2;
		int third = first / 2;
		
		System.out.printf("Number of people on day one is: %d%n", first);
		System.out.printf("Number of people on day two is: %d%n", second);
		System.out.printf("Number of people on day third is: %d%n", third);

	}

}
