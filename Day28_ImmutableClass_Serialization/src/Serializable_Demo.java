import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Employee implements Serializable{
	int empno;
	String name;
	public Employee()
	{
		
	}
	
	public Employee(int empno, String name)
	{
		super();
		this.empno = empno;
		this.name = name;
	}
	public String toString()
	{
		return empno+"-"+name;
	}
}


public class Serializable_Demo {

	public static void main(String[] args) {
		try
		{
			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("three.txt"));
			Employee e1 = new Employee(101, "Kevin");
			obj.writeObject(e1);
			System.out.println();
			
			ObjectInputStream oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream("three.txt")));
			Employee emp = (Employee) oin.readObject();
			System.out.println(emp);
		}
		catch(Exception e)
		{
			
		}
		
	}

}
