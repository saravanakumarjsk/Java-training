package jdbc;
import java.sql.*;

//update

public class Demo4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"system",
				"sk"
				);
		PreparedStatement ps = conn.prepareStatement("update s4 set sname=? where sno=?");
		ps.setString(1, "Ganesh");
		ps.setInt(2, 102);
		ps.executeUpdate();
		System.out.println("updated !");
		ps.close();
	}

}
