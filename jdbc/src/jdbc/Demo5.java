package jdbc;
import java.sql.*;

//insert

public class Demo5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"system",
				"sk"
				);
		PreparedStatement ps = conn.prepareStatement("delete from s4 where sno=?");
		ps.setInt(1, 101);
		ps.executeUpdate();
		System.out.println("deleted !");
		ps.close();
	}
}
