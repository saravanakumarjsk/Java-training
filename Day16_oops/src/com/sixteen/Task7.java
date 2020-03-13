package com.sixteen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the purchased date");
		
		String date = sc.next();
		System.out.println("Enter the purchase amount");
		
		Double amount = sc.nextDouble();
		
		if (Event.checkEventAvailable(date) instanceof LocalDate) 
		{
			System.out.println("The discounted amount is " + Event.getAmountWithDiscount(amount,
					LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
		} 
		else 
		{
			System.out.println(Event.checkEventAvailable(date));
		}
	}
}

class Event {
	static Object checkEventAvailable(String date) 
	{
		LocalDate d1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		if (d1.getMonthValue() % 2 == 0) 
		{
			return d1;
		} 
		else 
		{
			return "Not Eligible for BIG BASH event";
		}
	}

	static Double getAmountWithDiscount(Double amount, LocalDate date) 
	{
		int x = date.getMonthValue();
		double discount = ((double) x * amount) / 100;
		return amount - discount;
	}
}
