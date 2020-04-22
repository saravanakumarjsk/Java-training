package jdbc.date;
import jdbc.resource_bundle.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;


public class Demo10 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = DBConnection2.getConnection();
		Statement smt = conn.createStatement();
		ResultSet rs = smt.executeQuery("select * from emp");
		while(rs.next())
		{
			System.out.printf("%-15s%-15s\n",
					rs.getString("ename"),
					rs.getDate("doj"));
		}
		
		System.out.println("-----------------------");
		
		rs = smt.executeQuery("select * from emp");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		while(rs.next())
		{
			System.out.printf("%-15s%-15s\n",
					rs.getString("ename"),
					df.format(rs.getDate("doj").toLocalDate()));
		}
		System.out.println("-----------------------");
		
		rs = smt.executeQuery("select * from emp");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		while(rs.next())
		{
			System.out.printf("%-15s%-15s\n",
					rs.getString("ename"),
					sdf.format(rs.getDate("doj")));
		}
		
		
		
		//insert
		PreparedStatement ps = conn.prepareStatement("isnert into emp values(?,?,?,?)");
		ps.setInt(1, 301);
		ps.setString(2, "Ramesh");
		ps.setString(3, "Developer");
		ps.setInt(4, 8000);
		ps.setString(5, "10-Jan-2020");
		System.out.println("inserted");
		conn.close();
	}

}
