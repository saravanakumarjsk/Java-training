package jdbc.resource_bundle;

import java.util.*;
import java.sql.*;

public class DBConnection2 {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("oracle");
		String url = rb.getString("db.url");
		String username = rb.getString("db.username");
		String password = rb.getString("db.password");
		Class.forName("oracle.jdbc.driveer.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sk");
		return conn;
	}
}
