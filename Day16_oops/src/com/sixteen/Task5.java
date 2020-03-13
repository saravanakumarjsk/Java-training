package com.sixteen;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[100];
		int count = 0;
		String choice;
		do {
			p[count] = new Product();
			System.out.println("Enter product id");
			p[count].setId(sc.nextLong());
			System.out.println("Enter product name");
			sc.nextLine();
			p[count].setProductName(sc.nextLine());

			System.out.println("Enter supplier name");
			p[count].setSupplierName(sc.next());
			System.out.println("Enter product price");
			p[count].setPrice(sc.nextInt());
			System.out
					.println("Do you want to enter the details of another product?Enter yes or no(not case sensetive)");
			choice = sc.next().toLowerCase();
			count++;
		} while (choice.equals("yes"));
		ProductBO bo = new ProductBO();
		bo.displayAll(p, count);

	}

}

class Product {
	private long id;
	private String productName;
	private String supplierName;
	private int price;

	public Product() {
		id = 0;
		productName = "";
		supplierName = "";
		price = 0;
	}

	public Product(long id, String productName, String supplierName, int price) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

class ProductBO {
	public void displayAll(Product[] productList, int count) {
		System.out.format("%-10s %-20s %-20s %-10s\n", "Id", "ProductName", "SupplierName", "Price");
		for (int i = 0; i < count; i++) {
			long id = productList[i].getId();
			String productName = productList[i].getProductName();
			String supplierName = productList[i].getSupplierName();
			int price = productList[i].getPrice();
			System.out.format("%-10s %-20s %-20s %-10s\n", id, productName, supplierName, price);
		}
	}
}
