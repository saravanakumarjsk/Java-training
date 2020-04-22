package jdbc.pojoAndCollections;
import java.util.*;
import java.sql.*;

public class Demo7 {
	public static void options()
	{
		System.out.println("CRUD Operation");
		System.out.println("1. Select");
		System.out.println("2. Insert");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner input = new Scanner(System.in);
		
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> empList = new ArrayList();
		empList = dao.displayEmployee();
		
		boolean res = true;
		
		do
		{
			Demo7.options();
			System.out.println("enter your choice");
			int n = input.nextInt();
			
			switch(n)
			{
			case 1:
				// display the emp
				Iterator<Employee> data = empList.iterator();
				while(data.hasNext())
				{
					Employee e = data.next();
					System.out.printf("%-10s%-15s%-15s%-15s\n",
							e.getEno(),
							e.getEname(),
							e.getDesig(),
							e.getSalary());
				}
				System.out.println("Do you want to continue?");
				char s = input.next().charAt(0);
				if(s == 'y') {
					res = true;
					continue;
				}
				else {
					res=false;
					break;
				}
				
			case 2:
				int result = dao.insertEmployee();
				if(result>=1)
					System.out.println("inserted sucessfully !");
				System.out.println("Do you want to continue?");
				char s1 = input.next().charAt(0);
				if(s1 == 'y') {
					res = true;
					continue;
				}
				else {
					res=false;
					break;
				}
			case 3:
				int result1 = dao.updateEmployee();
				if(result1>=1)
					System.out.println("updated sucessfully !");
				System.out.println("Do you want to continue?");
				char s2 = input.next().charAt(0);
				if(s2 == 'y') {
					res = true;
					continue;
				}
				else {
					res=false;
					break;
				}
			case 4:
				int result2 = dao.deleteEmployee();
				if(result2>=1)
					System.out.println("deleted sucessfully !");
				System.out.println("Do you want to continue?");
				char s3 = input.next().charAt(0);
				if(s3 == 'y') {
					res = true;
					continue;
				}
				else {
					res=false;
					break;
				}
			case 5:
				System.exit(0);
			}
			
		}while(res);
		
	}

}
