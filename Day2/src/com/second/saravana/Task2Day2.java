package com.second.saravana;
import java.util.*;

public class Task2Day2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x = input.nextInt();
		
		System.out.println("Enter the value of y: ");
		int tot = input.nextInt();
		
		int ct = (tot - (5*x))/13;
		int at = (x + ct);
		int st = (ct * 2);
		
		System.out.printf("The number of children tickets sold: %d%n", ct);
		System.out.printf("The number of adult tickets sold: %d%n", at);
		System.out.printf("The number of senior tickets sold: %d%n", st);
		
	}

}
