package com.sixteen;

import java.util.Scanner;

class StallCategorey{
	private String name;
	private String detail;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getDetail() 
	{
		return detail;
	}
	public void setDetail(String detail) 
	{
		this.detail = detail;
	}
	
	public StallCategorey()
	{
		System.out.println("Using default constructor");
		name = "Book";
		detail = "All latest books are available under this categorey";
	}
	
	public StallCategorey(String name, String detail)
	{
		System.out.println("Using parameterized constructor");
		this.name = name;
		this.detail = detail;
	}
	
}

class StallCategoreyBO{
	public void DisplayDet(StallCategorey sc)
	{
		System.out.println("Name: "+sc.getName());
		System.out.println("Detail: "+sc.getDetail());
	}
}



public class Main3 {

	public static void main(String[] args) {
		StallCategorey sc = new StallCategorey();
		StallCategoreyBO sbo = new StallCategoreyBO();
		sbo.DisplayDet(sc);
		
		StallCategorey sc1 = new StallCategorey("Book", "All latest books are available under this categorey");
		sbo.DisplayDet(sc1);
		

	}

}
