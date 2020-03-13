package com.sixteen;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Item Type");
		int num = sc.nextInt();
		ItemType11 arr[] = new ItemType11[num];
		ItemTypeBusObj bo = new ItemTypeBusObj();
		for (int i = 0; i < num; i++) {
			sc.nextLine();
			ItemType11 x = new ItemType11();

			System.out.println("Enter the Item Type " + (i + 1) + " Name");
			x.setName(sc.nextLine());
			System.out.println("Enter the Deposit Amount");
			x.setDeposit(sc.nextDouble());
			System.out.println("Enter the Cost per Day");
			x.setCostPerDay(sc.nextDouble());
			bo.add(x, arr, i);

		}
		bo.display(arr);
		System.out.println("Enter the name of the item to be searched");
		String inp = sc.next();
		bo.search(inp, arr);

	}

}

class ItemType11 {
	private String name;
	private double deposit;
	private double costPerDay;

	public ItemType11() {
		name = "";
		deposit = 0.0;
		costPerDay = 0.0;
	}

	public ItemType11(ItemType11 r) {
		this.name = r.name;
		this.deposit = r.deposit;
		this.costPerDay = r.costPerDay;
	}

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

}

class ItemTypeBusObj {
	public void add(ItemType11 obj, ItemType11[] itemTypeArray, int index) {
		itemTypeArray[index] = new ItemType11(obj);
		System.out.println("item Type added successfully");

	}

	public void search(String search, ItemType11[] itemTypeArray) {
		for (int i = 0; i < itemTypeArray.length; i++) {
			if (itemTypeArray[i].getName().equals(search)) {
				System.out.println("Searched Item Type is:");
				System.out.println("Name:" + itemTypeArray[i].getName());
				System.out.println("Deposit Amount:" + itemTypeArray[i].getDeposit());
				System.out.println("Cost per Day:" + itemTypeArray[i].getCostPerDay());
				return;
			}
		}
		System.out.println("Item Type not Found");
	}

	public void display(ItemType11[] itemTypeArray) {
		for (int i = 0; i < itemTypeArray.length; i++) {
			System.out.println("Item Type Number " + (i + 1) + ":");
			System.out.println("Name:" + itemTypeArray[i].getName());
			System.out.println("Deposit Amount:" + itemTypeArray[i].getDeposit());
			System.out.println("Cost per Day:" + itemTypeArray[i].getCostPerDay());

		}
	}
}
