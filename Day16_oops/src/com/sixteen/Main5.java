package com.sixteen;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class ItemType1{
	private String name;
	private double deposit;
	private double costPerDay;
	
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public double getDeposit() 
	{
		return deposit;
	}
	public void setDeposit(double deposit) 
	{
		this.deposit = deposit;
	}
	
	
	public double getCostPerDay() 
	{
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) 
	{
		this.costPerDay = costPerDay;
	}
	
	public ItemType1(String name, double deposit, double costPerDay)
	{
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	
	public ItemType1()
	{
		name = "Rolling Fan";
		deposit = 500.00;
		costPerDay = 50.00;
	}
	
}

class ItemTypeBOT{
	
	public double calculateCost(LocalDate d1, LocalDate d2, ItemType1 itt)
	{
		Period p = Period.between(d1, d2);
		double k = p.getDays()*itt.getCostPerDay();
		return k;
	}
}

public class Main5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ItemType1 itt = new ItemType1();
		ItemTypeBOT ibo = new ItemTypeBOT();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println("enter the item type name:");
		itt.setName(input.next());
		
		System.out.println("enter the deposit amount:");
		itt.setDeposit(input.nextDouble());
		
		System.out.println("enter the cost per day:");
		itt.setCostPerDay(input.nextDouble());
		
		System.out.println("Enter start date:");
		LocalDate dt1 = LocalDate.parse(input.next(), df);
		
		System.out.println("Enter end date:");
		LocalDate dt2 = LocalDate.parse(input.next(), df);
		
		System.out.println("The total cost is Rs:"+ibo.calculateCost(dt1, dt2, itt));

	}
}
