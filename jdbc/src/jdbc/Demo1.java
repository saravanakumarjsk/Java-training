package jdbc;
import java.sql.*;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe", "system", "sk");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp");
		
		while(rs.next())
		{
			System.out.println(
					rs.getInt(1)+"-"+
					rs.getString(2)+"-"+
					rs.getString(3)+"-"+
					rs.getInt(1)
					);
		}
		conn.close();
	}

}
