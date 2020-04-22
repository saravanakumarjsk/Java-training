package jdbc;
import java.sql.*;

//Create

public class Demo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"system",
				"sk"
				);
		
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("create table s4(sno number, sname varchar(25))");
		System.out.println("Table created !");
		conn.close();
	}

}
