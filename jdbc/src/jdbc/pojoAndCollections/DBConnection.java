package jdbc.pojoAndCollections;
import java.sql.*;

public class DBConnection {

	public static Connection getConnection() throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"system",
				"sk"
				);
		return conn;
	}

}
