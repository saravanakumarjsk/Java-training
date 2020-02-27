package com.First.saravana;
import java.util.*;


public class task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		System.out.println("Enter the name of the event: ");
		name = input.nextLine();
		
		String type;
		System.out.println("Enter the type of event: ");
		type = input.nextLine();
		
		int people;
		System.out.println("Enter the num of ppl expected: ");
		people = input.nextInt();
		
		String paid;
		System.out.println("Is it paid? type (Y or N): ");
		paid = input.next();
		
		float expense;
		System.out.println("enter the total expences: ");
		expense = input.nextFloat();
		
		System.out.printf("Event name: %s%n",name);
		System.out.printf("Event type: %s%n",name);
		System.out.printf("Expected count: %d%n", people);
		System.out.printf("Paid Entry: %s%n", paid);
		System.out.printf("Projected Expense: %.1f L%n", expense);

	}
	
}
