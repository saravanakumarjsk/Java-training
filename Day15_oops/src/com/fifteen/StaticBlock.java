package com.fifteen;

public class StaticBlock {

	public static void main(String[] args) 
	{
		Demo2 d = new Demo2(100, "sk", 3456);
		Demo2 m = new Demo2(219, "sk", 7656);
		
		System.out.println("d salary is "+ d.computeSalary());
		System.out.println("m salary is "+ m.computeSalary());
		
		Demo2.changeMinSalary(10_000);
		
		System.out.println("d salary is "+ d.computeSalary());
		System.out.println("m salary is "+ m.computeSalary());
	}

}

class Demo2 {

	int empno;
	String name;
	float salary;
	static int min_sal;
	
	static 
	{
		min_sal = 5000;
	}
	
	Demo2(int empno, String name, float salary)
	{
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	
	float computeSalary()
	{
		if(salary > min_sal)
			return salary;
		else
			return min_sal;
		
	}
	static void changeMinSalary(int increment)
	{
		min_sal = min_sal + increment;
	}
	

}
