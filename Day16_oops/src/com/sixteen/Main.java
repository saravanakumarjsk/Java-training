package com.sixteen;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

class Employee {
	private float salary;
	private String name;
	private int empno;
	private LocalDate doj;

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public int getEmpno() {
		return empno;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

}

class EmployeeBo {
	public void DisplayDet(Employee ee) {
		System.out.println(ee.getSalary());
		System.out.println(ee.getEmpno());
		System.out.println(ee.getName());
	}

	public float annualSalary(Employee ee) {
		return ee.getSalary() * 12;
	}

	public int yearOfExp(Employee ee) {
		LocalDate n = LocalDate.now();
		Period p = Period.between(ee.getDoj(), n);
		return p.getYears();
	}
}

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		Employee e = new Employee();
		EmployeeBo eb = new EmployeeBo();

		e.setDoj(LocalDate.parse(input.next()));

		e.setSalary(input.nextFloat());
		e.setName(input.next());
		e.setEmpno(input.nextInt());

		eb.annualSalary(e);

		System.out.println("The total years of experience is: " + eb.yearOfExp(e));
		eb.DisplayDet(e);

		System.out.println("Updated Salary " + eb.annualSalary(e));

	}
}