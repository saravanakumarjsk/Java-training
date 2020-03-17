package com;
import java.util.*;

class ItemType{
	private String name;
	private double deposit;
	private double costPerDay;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	
	public ItemType()
	{
		
	}
	
	public ItemType(String name, double deposit, double costPerDay)
	{
		System.out.printf("%-20s %-20s %-20s", "name", "deposit", "costPerDay");
		System.out.println();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
		System.out.printf("%-20s %-20f %-20f", name, deposit, costPerDay);
	}
	
	@Override
	public String toString() {
		return String.format("%-20s %-20s %-20s", getName(), getDeposit(), getCostPerDay());
	}
}

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<ItemType> lst = new ArrayList<ItemType>();
		
		boolean res = true;
		
		do
		{
			ItemType itm = new ItemType();
			int count = 1;
			System.out.println("Enter the details of  item type "+count);
			
				System.out.println("Name");
				itm.setName(input.next());
				
				System.out.println("Deposit");
				itm.setDeposit(input.nextDouble());
				
				System.out.println("Cost per Day");
				itm.setCostPerDay(input.nextDouble());
				
				lst.add(itm);
				System.out.println("Do you want to continue (y/n)");
				if(input.next().charAt(0) == 'y')
				{
					continue;
				}
				else
				{
					res = false;
				}
				count++;
				System.out.printf("%-20s %-20s %-20s\n", "name", "deposit", "costPerDay");

			
		}while(res);
		
		Iterator<ItemType> data = lst.iterator();
		
		while(data.hasNext())
		{
			ItemType itp = data.next();
			System.out.println(itp);
		}
		

	}

}
