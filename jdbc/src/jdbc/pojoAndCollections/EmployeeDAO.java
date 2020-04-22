package jdbc.pojoAndCollections;
import java.util.*;
import java.sql.*;

public class EmployeeDAO {
	
	Connection conn = null;
	Scanner input = new Scanner(System.in);

	public List<Employee> displayEmployee() throws ClassNotFoundException, SQLException
	{
		List<Employee> empList = new ArrayList<Employee>();
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp");
		
		while(rs.next())
		{
			Employee e = new Employee();
			e.setEno(rs.getInt("eno"));
			e.setEname(rs.getString("ename"));
			e.setDesig(rs.getString("desig"));
			e.setSalary(rs.getInt("salary"));
			empList.add(e);
		}
		conn.close();
		return empList;
	}
	
	public int insertEmployee() throws ClassNotFoundException, SQLException
	{
		Employee e = new Employee();
		
		System.out.println("Enter the emp details");
		
		System.out.println("No: ");
		e.setEno(input.nextInt());
		
		System.out.println("Name: ");
		e.setEname(input.next());
		
		System.out.println("Desig: ");
		e.setDesig(input.next());
		
		System.out.println("Salary: ");
		e.setSalary(input.nextInt());
		
		
		conn = DBConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement("insert into emp values(?,?,?,?)");
		ps.setInt(1, e.getEno());
		ps.setString(2, e.getEname());
		ps.setString(3, e.getDesig());
		ps.setInt(4, e.getSalary());
		int result = ps.executeUpdate();
		conn.close();
		return result;
	}
	
	public int updateEmployee() throws ClassNotFoundException, SQLException 
	{
		Employee e = new Employee();
		
		System.out.println("No: ");
		e.setEno(input.nextInt());
		
		System.out.println("Name: ");
		e.setEname(input.next());
		
		System.out.println("Desig: ");
		e.setDesig(input.next());
		
		System.out.println("Salary: ");
		e.setSalary(input.nextInt());
		
		conn = DBConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement("update emp set ename=?, desig=?, salary=? where eno=?");
		ps.setInt(4, e.getEno());
		ps.setString(1, e.getEname());
		ps.setString(2, e.getDesig());
		ps.setInt(3, e.getSalary());
		int result = ps.executeUpdate();
		conn.close();
		return result;
	}
	
	public int deleteEmployee() throws ClassNotFoundException, SQLException
	{
		Employee e = new Employee();
		System.out.println("delete from called");
		
		System.out.println("No: ");
		e.setEno(input.nextInt());
		
		conn = DBConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement("delete from emp where eno=?");
		ps.setInt(1, e.getEno());
		int result = ps.executeUpdate();
		conn.close();
		return result;
	}

}
