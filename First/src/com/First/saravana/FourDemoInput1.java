package com.First.saravana;
import java.util.*;


public class FourDemoInput1 {

	public static void main(String[] args) {
		int num1, num2, result;
		float val1;
		String name;
		
		Scanner input = new Scanner(System.in);
		
//		System.out.println("enter the name: ");
//		name = input.nextLine();
//		num1 = input.nextInt();
//		num2 = input.nextInt();
//		val1 = input.nextFloat();
		
		System.out.println("enter two ints:");
		num1 = input.nextInt();
		
		input.nextLine();
		System.out.println("enter the name:");
		name = input.nextLine();
		
		num2 = input.nextInt();
		
		result = num1 + num2;
		
		
		System.out.printf("%d + %d is %d which was provided by %s",num1, num2, result, name);
		

	}

}
