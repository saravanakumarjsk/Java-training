package com.fifteen;

class Demo3 {

	private int empno;
	private String name;
	private float salary;

	public Demo3() {
		empno = 101;
		name = "Ram";
		salary = 5000;
	}

	public float computeSalary(int all, int ded) {
		return salary + all - ded;
	}

	@Override
	public String toString() {
		return "Demo3 [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public void finalize() {
		System.out.println("Calling finalize method");
	}

}

public class FinalizeMethod{
	public static void main(String[] args)
	{
		Demo3 d = new Demo3();
		System.out.println(d);
		Demo3 d1 = new Demo3();
		
		System.out.println(d.computeSalary(500, 100));
	}
}
