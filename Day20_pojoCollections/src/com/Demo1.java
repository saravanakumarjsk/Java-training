package com;
import java.util.*;

class Employee{
	private int empno;
	private String name;
	private int salary;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}


public class Demo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// create new emp object 
		Employee e = new Employee();
		
		
		// create new ArrayList with employee type
		List<Employee> emplist = new ArrayList();
		
		//
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) 
		{
			System.out.println("emp details");
			
			e.setEmpno(input.nextInt());
			e.setName(input.next());
			e.setSalary(input.nextInt());
			
			emplist.add(e);
		}
		
		Iterator data = emplist.iterator();
		
		while(data.hasNext())
		{
			Employee ep = (Employee) data.next();
			System.out.println(ep.getEmpno()+" "+ep.getName()+" "+ep.getSalary());
		}
	}
}
