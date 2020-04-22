package jdbc;
import java.sql.*;

//insert

public class Demo3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"system",
				"sk"
				);
		PreparedStatement ps = conn.prepareStatement("insert into s4 values(?,?)");
		ps.setInt(1, 101);
		ps.setString(2, "Ramesh");
		ps.executeUpdate();
		System.out.println("inserted !");
		ps.close();
	}

}
