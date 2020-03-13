package com.fifteen;

import java.util.Scanner;

class Demo 
{
  private String name; // private = restricted access

  // Getter
  public String getName() 
  {
    return name;
  }

  // Setter
  public void setName(String newName) 
  {
    this.name = newName;
  }
  
  public void DisplayDet(String name) 
  {
	  System.out.println(name);
  }
}

public class GetterSetter 
{
	static int a=10;
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		Demo myObj = new Demo();
		
		myObj.DisplayDet(name);
		
//		System.out.println(myObj.getName()); // getter before setting the name
//		
//		myObj.setName("John Oliver"); // setter
//		
//		System.out.println(myObj.getName()); // getter after setting the name
	
	}
}