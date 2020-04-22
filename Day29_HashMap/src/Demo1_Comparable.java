import java.util.*;

class Employee implements Comparable<Employee> {
	private int eno;
	private String ename;
	private int salary;

	public Employee(int eno, String ename, int salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	public String toString() {
		return ename + "       " + eno + "       " + salary;
	}

	@Override
	public int compareTo(Employee e)
	{
		if(this.salary > e.salary)
		{
			return 1;
		}
		else if(this.salary < e.salary)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}


public class Demo1_Comparable {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(101, "Ram", 20000));
		list.add(new Employee(102, "Vimal", 30000));
		list.add(new Employee(103, "Bala", 10000));
		list.add(new Employee(104, "Krishna", 50000));
		list.add(new Employee(105, "Giresh", 40000));

		System.out.println("Before sorting");
		for(Employee e: list)
		{
			System.out.println(e);
		}

		Collections.sort(list);
		System.out.println("After sorting");

		for(Employee e: list)
		{
			System.out.println(e);
		}

	}

}
