package com;
import java.util.*;

class User{
	private String name;
	private String number;
	private String userName;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User(String name, String number, String userName, String email)
	{
		this.name = name;
		this.number = number;
		this.userName = userName;
		this.email = email;
	}
	

	
	public void display()
	{
		System.out.printf("%-20s %-20s %-20s %-20s\n", name, number, userName, email);
	}
	
}

// ram ganesh,34563485934,ram,ram@abs.ni

class UserBO extends ArrayList<User>{
	static User u1 = new User("Mohan Raja", "48957947", "Mohan", "Mohan@abc.in");
	static User u2 = new User("Arun Vijay", "3784563448", "Arun", "Arun@abc.in");
	static User u3 = new User("Arjun Ganesh", "3489534897", "Arjun", "Arjun@abc.in");
	static User u4 = new User("Someash kk", "894756045", "Someash", "Someash@abc.in");
	
	static UserBO ubs = new UserBO();
	
	static 
	{
		ubs.add(u1);
		ubs.add(u2);
		ubs.add(u3);
		ubs.add(u4);
	}
	
	public void removeUser(int n1, int n2)
	{
		this.removeRange(n1, n2);
	}
	public static UserBO usbogetList()
	{
		return ubs;
	}
}

public class Task5{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of User details to be added");
		int n = input.nextInt();
		input.nextLine();
		
		UserBO ubs = new UserBO();
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the user  details in csv format");
			String ss = input.nextLine();
			String[] s1 = ss.split(",");
			User us = new User(s1[0], s1[1], s1[2], s1[3]);
			ubs.add(us);
		}
		
		UserBO data = UserBO.usbogetList();
		
		data.addAll(ubs);

		
		ListIterator<User> itr = data.listIterator();
		
		while(itr.hasNext())
		{
			itr.next().display();
		}
		
		
		System.out.println("Enter the range to be deleted");
		
		data.removeUser(input.nextInt(), input.nextInt());
		
		System.out.println("************");
		itr = data.listIterator();
		while(itr.hasNext())
		{
			itr.next().display();
		}
		

	}
}
