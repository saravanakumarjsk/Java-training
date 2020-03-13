package com.sixteen;

import java.util.Scanner;

class ItemType{
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
	
}

class ItemTypeBO{
	public void DisplayDet(ItemType itt)
	{
		System.out.printf("Item Name: %s%n", itt.getName());
		System.out.printf("Deposit Amount: %.1f%n", itt.getDeposit());
		System.out.printf("Cost per day: %.1f%n", itt.getCostPerDay());
	}
}

public class Main1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ItemType itt = new ItemType();
		ItemTypeBO ibo = new ItemTypeBO();
		
		System.out.println("enter the item type name:");
		itt.setName(input.next());
		
		System.out.println("enter the deposit amount:");
		itt.setDeposit(input.nextDouble());
		
		System.out.println("enter the cost per day:");
		itt.setCostPerDay(input.nextDouble());
		
		ibo.DisplayDet(itt);

	}

}
