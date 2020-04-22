import java.util.*;

class Employee1{
	private int eno;
	private String ename;
	private int salary;
	
	public Employee1()
	{
		
	}

	public Employee1(int eno, String ename, int salary)
	{
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return eno+"  " + ename + "   " + salary;
	}
}

class NameComparator implements Comparator<Employee1>{
	public int compare(Employee1 e1, Employee1 e2)
	{
		return e1.getEname().compareTo(e2.getEname());
	}
}

class SalaryComparator implements Comparator<Employee1>{
	public int compare(Employee1 e1, Employee1 e2)
	{
		if(e1.getSalary() > e2.getSalary())
		{
			return 1;
		}
		else if(e1.getSalary() < e2.getSalary())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}


public class Demo2_Comparator {

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<Employee1>();

		list.add(new Employee1(101, "Ram", 20000));
		list.add(new Employee1(102, "Vimal", 30000));
		list.add(new Employee1(103, "Bala", 10000));
		list.add(new Employee1(104, "Krishna", 50000));
		list.add(new Employee1(105, "Giresh", 40000));

		System.out.println("before sorting");
		for(Employee1 e: list)
		{
			System.out.println(e);
		}
		System.out.println();

		SalaryComparator s = new SalaryComparator();
		Collections.sort(list, s);

		System.out.println("After sorting salary");
		for(Employee1 e: list)
		{
			System.out.println(e);
		}
		System.out.println();
		
		
		NameComparator n = new NameComparator();
		Collections.sort(list, n);
		
		System.out.println("After sorting name");
		for(Employee1 e: list)
		{
			System.out.println(e);
		}
		System.out.println();

	}

}
