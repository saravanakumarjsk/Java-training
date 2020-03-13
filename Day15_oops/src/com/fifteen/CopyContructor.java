package com.fifteen;

public class CopyContructor {

	public static void main(String[] args) {
		Demo4 e = new Demo4();
		Demo4 e1 = new Demo4(e);
		
		System.out.println("e :"+e.computeSalary(500, 100));
		System.out.println("e1:"+e1.computeSalary(500, 100));

	}
}


class Demo4 {

	private int empno;
	private String name;
	private float salary;

	public Demo4(Demo4 r) 
	{
		empno = r.empno;
		name = r.name;
		salary = r.salary;
	}

	public Demo4(String name)
	{
		this.name = name;
	}
	
	public Demo4()
	{
		this("Dhoni");
		empno = 101;
		salary = 5000;
	}
	
	public float computeSalary(int all, int ded) {
		return salary + all - ded;
	}

}

